@echo off
set titleName=Periodic Table Manager
title %titleName%
set managerDir=dbManager
set plus=+
set one=1
cd ..\

:start
set setupStatus= 
if exist %managerDir%\setupStatus set /p setupStatus=<%managerDir%\setupStatus
set setupStatusOutput=Database status unknown
if %setupStatus% == true set setupStatusOutput=Database already set up
if %setupStatus% == false set setupStatusOutput=Database setup needed

cls
echo Welcome to %titleName%!
echo.
echo Operational modes:
echo 1 - first time setup (%setupStatusOutput%)
echo 2 - edit values
echo x - exit
echo.
set modeChoice=
set /p modeChoice=Select operational mode: 
if %modeChoice% == 1 goto firstSetup
if %modeChoice% == 2 goto valueEdit
if %modeChoice% == x exit
goto start

:firstSetup
echo.
echo First time setup running...
start /w %managerDir%\setup.bat %managerDir%
goto start

:valueEdit
echo.
echo This functionality is not working yet.
echo.
pause
goto start