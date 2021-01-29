package fuels;

import java.util.Map;

public class FuelDatabase {

    public static Map<String, FuelParameters> fuelMap;

    public static class FuelParameters {
        public double energyPerMass;
        public double density;

        FuelParameters(
                double _energyPerMass,
                double _density){
            energyPerMass = _energyPerMass; // J/kg
            density = _density; // kg/m3
        }
    }

    public static void addNewFuel(String name, FuelParameters parameters){
        if (name == null || name.equals("")){
            System.err.println("Trying to add an unnamed fuel to the fuel database.");
        } else if (checkFuelDefined(name)){
            System.err.println("Trying to add an already defined fuel to the fuel database.");
        } else {
            fuelMap.put(name, parameters);
        }
    }

    private static boolean checkFuelDefined(String name){
        return (!fuelMap.isEmpty() &&
                fuelMap.containsKey(name) &&
                fuelMap.get(name) != null);
    }


}
