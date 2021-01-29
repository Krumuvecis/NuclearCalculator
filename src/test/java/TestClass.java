import fuels.FuelDatabase;
import fuels.FuelPrepopulator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @BeforeAll
    static void prepareFuelDatabase(){
        FuelPrepopulator.prepopulate();
    }

    @Test
    void firstTest(){
        double expected = 1;
        double actual = Main.variable;
        assertEquals(expected, actual, "Testing error");
    }

    @Test
    void test2(){
        double expected = 40000000;
        double actual = FuelDatabase.fuelMap.get("Fuel-1").energyPerMass;
        assertEquals(expected, actual, "Testing fuel database");
    }

}
