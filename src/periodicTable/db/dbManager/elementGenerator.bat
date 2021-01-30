@echo off
set managerDir=%1
set element=%2
title Element Generator - Element %2

:start
cls
echo Element generator - element %2
echo.
set /p elementSymbol=Element symbol: 
set /p elementName=Element name: 
echo.
goto create

:createElement
echo Creating element %element% directory and main parameters...
if not exist %element%\ mkdir %element%
cd %element%
start /w ..\%managerDir%\elementalDataGenerator.bat %elementSymbol% %elementName%
echo.
goto createIsotope

:createIsotope
echo Creating isotopes ...
if not exist isotopes\ mkdir isotopes
cd isotopes
start /w ..\..\%managerDir%\isotopeGenerator.bat %elementSymbol% %elementName%
echo.
goto end

:end
echo Element successfully generated.
echo.
pause
exit