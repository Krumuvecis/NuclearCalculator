@echo off
title Periodic Table Manager - First time setup
set managerDir=%1

:start
cls
echo First time database setup.
echo Type x to exit setup.
echo.
set element=1
set maxelement=0
set /p maxelement=Choose the number of elements: 
if %maxelement% == x exit
if %maxelement% GEQ %element% goto elementCheck
goto start

:elementCheck
cls
if exist %element%\ goto overwritePrompt
goto generateElement

:overwritePrompt
echo Trying to generate element [%element%/%maxelement%] - element already exists.
set overwriteChoice= 
set /p overwriteChoice=Do you want to overwrite it? (y/n) 
if %overwriteChoice% == y goto generateElement
if %overwriteChoice% == n goto compareElement
goto elementCheck

:generateElement
echo Generating element [%element%/%maxelement%]
start /w %managerDir%\elementGenerator.bat %managerDir% %element%
goto compareElement

:compareElement
if %element% GEQ %maxelement% goto end
set /a element=%element%%plus%%one%
goto elementCheck

:end
rem echo true>%managerDir%\setupStatus
cls
echo Setup complete.
echo %maxelement% elements generated.
echo.
pause
exit