import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    void firstTest(){
        double expected = 1;
        double actual = Main.variable;
        assertEquals(expected, actual, "Testing error");
    }

}
