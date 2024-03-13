import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.example.DriverInitializer.driver;
import static org.example.DriverInitializer.initDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {



    @Test
    public void testAddition() {
        initDriver();

        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
        .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add"))
        .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
        .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
        .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "12");

        //assertEquals("12",driver.findElement(By.AndroidUiAutomator("newUISelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/result\")")));

    }

    @Test
    public void testSubtraction() {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_sub"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "6");
       // assertEquals("6",driver.findElement(By.AndroidUiAutomator("newUISelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/result\")")));

    }

    @Test
    public void testMultiplication() {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_mul"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "27");
        //assertEquals("27",driver.findElement(By.AndroidUiAutomator("newUISelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/result\")")));

    }

    @Test
    public void testDivision() {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_div"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "3");
        //assertEquals("3",driver.findElement(By.AndroidUiAutomator("newUISelector().packageName(\"com.google.android.calculator\").resourceId(\"com.google.android.calculator:id/result\")")));

    }



}
