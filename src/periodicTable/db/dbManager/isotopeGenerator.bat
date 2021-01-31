@echo off
set elementSymbol=%1
set elementName=%2
title Isotope generator - %elementName% [%elementSymbol%]
set plus=+
set minus=-
set one=1

:start
cls
echo Isotope generator for element: %elementName% [%elementSymbol%]
echo.
set isotope=1
set maxisotope=0
set /p isotope=Select lowest known isotope: 
set /p maxisotope=Select highest known isotope: 
set /a isotopeCount=%maxisotope%%minus%%isotope%%plus%%one%
if %isotope% LEQ 0 goto start
if %maxisotope% GEQ %isotope% goto isotopeParameters
goto start

:isotopeParameters
cls
echo Generating isotope [%isotope%/%maxisotope%] for element: %elementName% [%elementSymbol%]
echo.
set mass=empty
set /p mass=Mass: 
if %mass% == empty goto isotopeParameters
set halfLife=empty
set /p halfLife=HalfLife: (x if stable) 
if %halfLife% == empty goto isotopeParameters
if %halfLife% == x goto generateIsotope
set halfLifeUnits= 
set /p halfLifeUnits=HalfLife measurement units: (s/min/h/d/w/mon/y) 
set unitSet=false
if %halfLifeUnits% == s set unitSet=true
if %halfLifeUnits% == min set unitSet=true
if %halfLifeUnits% == h set unitSet=true
if %halfLifeUnits% == d set unitSet=true
if %halfLifeUnits% == w set unitSet=true
if %halfLifeUnits% == mon set unitSet=true
if %halfLifeUnits% == y set unitSet=true
if %unitSet% == true goto generateIsotope
goto isotopeParameters

:generateIsotope
echo mass:%mass%>%isotope%
if %halfLife% == x goto stableIsotope
echo halfLife:%halfLife%>>%isotope%
echo halfLifeUnits:%halfLifeUnits%>>%isotope%
goto decayModesPrepare

:stableIsotope
echo halfLife:stable>>%isotope%
goto compareIsotope

:decayModesPrepare
set decayModeCountSet=false
set decayModeNumber=1
goto decayModesHead

:decayModesHead
cls
echo Generating isotope [%isotope%/%maxisotope%] for element: %elementName% [%elementSymbol%]
echo.
echo Mass: %mass%
echo HalfLife: %halfLife% %halfLifeUnits%
echo.
echo Adding decay modes.
echo.
if %decayModeCountSet% == true goto decayModeParameters
goto decayModeSelect

:decayModeSelect
set decayModeCountInput= 
set /p decayModeCountInput=Number of decay modes: 
set /a decayModeCount=%decayModeCountInput%
if %decayModeCount% GTR 0 set decayModeCountSet=true
goto decayModesHead

:decayModeParameters
echo Adding decay mode [%decayModeNumber%/%decayModeCount%]
echo.
set decayModeType=empty
set /p decayModeType=Decay type: 
if %decayModeType% == empty goto decayModesHead
set decayModeProbability=empty
set /p decayModeProbability=Decay mode probability: 
if %decayModeProbability% == empty goto decayModesHead
goto decayModeAdd

:decayModeAdd
echo.>>%isotope%
echo decayMode>>%isotope%
echo type:%decayModeType%>>%isotope%
echo probability:%decayModeProbability%>>%isotope%
goto decayModeCompare

:decayModeCompare
if %decayModeNumber% GEQ %decayModeCount% goto compareIsotope
set /a decayModeNumber=%decayModeNumber%%plus%%one%
goto decayModesHead

:compareIsotope
if %isotope% GEQ %maxisotope% goto end
set /a isotope=%isotope%%plus%%one%
goto isotopeParameters

:end
cls
echo %isotopeCount% isotopes generated successfully.
echo.
pause
exit