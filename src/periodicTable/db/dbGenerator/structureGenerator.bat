@echo off
set plus=+
set one=1
cd ..\

:start
cls
echo Welcome to Periodic Table generator!
echo.
echo Operational modes:
echo 1 - first time setup
echo 2 - edit values
echo x - exit
echo.
set modeChoice=
set /p modeChoice=Select operational mode: 
if %modeChoice% == 1 goto firstSetup
if %modeChoice% == 2 goto valueEdit
if %modeChoice% == x exit
goto start

:valueEdit
echo.
echo This functionality is not working yet.
echo.
pause
goto start

:firstSetup
cls
echo First time database setup.
echo Type x to go back.
echo.
set element=1
set maxelement=0
set /p maxelement=Choose the number of elements: 
if %maxelement% == x goto start
if %maxelement% GEQ %element% goto generateElement
goto firstSetup

:generateElement
echo generating element [%element%/%maxelement%]
mkdir %element%
cd %element%
goto generateElementalData

:generateElementalData
xcopy ..\dbGenerator\main.yaml
mkdir isotopes
goto compareElement

:compareElement
cd ..\
if %element% GEQ %maxelement% goto end
set /a element=%element%%plus%%one%
goto generateElement

:end
dir
pause
exit