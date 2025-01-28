import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AdvancedMathTest {

    private AdvancedMath ad;

    @BeforeEach
    void setUp() {
        ad = new AdvancedMath();
    }

    @AfterEach
    void tearDown() {
        ad = null;
    }

    @Test
    void addition() {
        assertEquals(22, ad.addition(20,2));
        assertEquals(-22, ad.addition("-20",-2));
    }

    @Test
    void additionStringInput_invalid() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {ad.addition("abc",2);});
        assertEquals("Invalid input", e.getMessage());
    }


    @Test
    void multiply() {
        Exception e = assertThrows(OverTheLimitException.class, () -> {ad.multiply(900000000, 900000000);});
        assertEquals("value over the limit", e.getMessage());
    }
}

