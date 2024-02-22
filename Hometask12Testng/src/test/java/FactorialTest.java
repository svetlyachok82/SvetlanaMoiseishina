import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void testFactorial() {
        int number = 7;
        int expectedFactorial = 5040;//!7=5040
        int actualFactorial = calculateFactorial(number);
        Assert.assertEquals(actualFactorial, expectedFactorial,
                "Factorial calculated is incorrect");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeNumberFactorial(){
        int negativeNumber=-7;
        calculateFactorial(negativeNumber);
    }

    @Test
    public void testFactorialOfZero(){
        int zero=0;
        int expectedFactorial=1;//!0=1
        int actualFactorial=calculateFactorial(zero);
        Assert.assertEquals(actualFactorial,expectedFactorial,"Factorial of 0 should be 1");
    }
    private int calculateFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }

}
