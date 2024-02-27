import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMTS {
    public static String baseUrl = "https://www.mts.by/?hash-offset=70&hash-dur=1300#pay-section";
    public static WebDriver driver;

    @BeforeEach
    public void Start() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Igor\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement applyCookies = driver.findElement(By.id("cookie-agree"));
        applyCookies.click();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void titleBlock() {
        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        String actualTitle = blockTitle.getText();
        Assertions.assertEquals(expectedTitle, actualTitle, "Название блока не соответствует ожидаемому");
    }

    @Test
    public void logoPaySystems() {
        WebElement logo1 = driver.findElement
                (By.xpath("//img[@alt='Visa']"));
        assertTrue(logo1.isDisplayed(), "Логотип не отображается");
        WebElement logo2 = driver.findElement
                (By.xpath("//img[@alt='Verified By Visa']"));
        assertTrue(logo2.isDisplayed(), "Логотип не отображается");
        WebElement logo3 = driver.findElement
                (By.xpath("//img[@alt='MasterCard']"));
        assertTrue(logo3.isDisplayed(), "Логотип не отображается");
        WebElement logo4 = driver.findElement
                (By.xpath("//img[@alt='MasterCard Secure Code']"));
        assertTrue(logo4.isDisplayed(), "Логотип не отображается");
        WebElement logo5 = driver.findElement
                (By.xpath("//img[@alt='Белкарт']"));
        assertTrue(logo5.isDisplayed(), "Логотип не отображается");
        WebElement logo6 = driver.findElement
                (By.xpath("//img[@alt='МИР']"));
        assertTrue(logo6.isDisplayed(), "Логотип не отображается");
    }

    @Test
    public void linkWork() {
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl, "URL не соответствует ожидаемому");

    }

    @Test
    public void payForCommunication(){
        WebElement inputNumber = driver.findElement(By.xpath("//input[@class='phone']"));
        inputNumber.click();
        inputNumber.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//input[@class='total_rub']"));
        inputSum.click();
        inputSum.sendKeys("50");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@class='email']"));
        inputEmail.click();
        inputEmail.sendKeys("help_me@please.by");
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();

    }

}




