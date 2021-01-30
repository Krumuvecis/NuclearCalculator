set plus=+
set one=1

set element=1
set maxelement=5

cd ..\

:generateElement
echo generating element %element%
mkdir %element%
cd %element%
goto generateElementalData

:generateElementalData
xcopy ..\dbGenerator\main.yaml
mkdir isotopes
goto compareElement

:compareElement
cd ..\
if %element% == %maxelement% goto end
set /a element=%element%%plus%%one%
goto generateElement

:end
dir
pause
exit