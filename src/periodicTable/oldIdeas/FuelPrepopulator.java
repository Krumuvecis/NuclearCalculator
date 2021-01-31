package periodicTable.oldIdeas;

import java.util.HashMap;

public class FuelPrepopulator {

    public static void prepopulate(){
        FuelDatabase.fuelMap = new HashMap<>();
        standardFuels();
        additionalFuels();
    }

    private static void standardFuels(){
        FuelDatabase.addNewFuel(
                "Fuel-1",
                new FuelDatabase.FuelParameters(4e+7,1000));
        FuelDatabase.addNewFuel(
                "Fuel-2",
                new FuelDatabase.FuelParameters(12e+7,2000));
    }

    private static void additionalFuels(){
        //FuelDatabase.addNewFuel();
    }

}
