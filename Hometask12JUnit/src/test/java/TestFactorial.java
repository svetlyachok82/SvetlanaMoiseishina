
import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorial {
    @Test
    public void testFactorialCalculation() {
        int result = Main.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialForZero() {
        int result = Main.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialForNegativeNumber() {
        int result = Main.calculateFactorial(-5);
        assertEquals(1, result);
    }

}
