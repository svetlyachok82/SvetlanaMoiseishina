import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class TestMTS {
    public static String baseUrl = "https://www.mts.by/?hash-offset=70&hash-dur=1300#pay-section";
    public static WebDriver driver;

    @BeforeEach
    public void Start() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Igor\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement applyCookies = driver.findElement(By.id("cookie-agree"));
        applyCookies.click();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void payForConnection() {
        WebElement selectService = driver.findElement(By.xpath("//span[@class='select__arrow']"));
        selectService.click();
        WebElement payConnection = driver.findElement(By.xpath("//li[1]/p[text()='Услуги связи']"));
        payConnection.click();
        WebElement inscriptionPhone = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        String inscription = inscriptionPhone.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода номера телефона варианта 'Услуги связи': " + inscription);
        WebElement inscriptionSum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        String inscription1 = inscriptionSum.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода суммы варианта 'Услуги связи': " + inscription1);
        WebElement inscriptionEmail = driver.findElement(By.xpath("//input[@id='connection-email']"));
        String inscription2 = inscriptionEmail.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода e-mail варианта 'Услуги связи': " + inscription2);


    }

    @Test
    public void homeInternet() {
        WebElement selectService = driver.findElement(By.xpath("//span[@class='select__arrow']"));
        selectService.click();
        WebElement internet = driver.findElement(By.xpath("//li[2]/p[text()='Домашний интернет']"));
        internet.click();
        WebElement inscriptionInternetPhone = driver.findElement(By.xpath("//input[@id='internet-phone']"));
        String inscription = inscriptionInternetPhone.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода номера абонента варианта 'Домашний интернет': " + inscription);
        WebElement inscriptionInternetSum = driver.findElement(By.xpath("//input[@id='internet-sum']"));
        String inscription1 = inscriptionInternetSum.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода суммы варианта 'Домашний интернет': " + inscription1);
        WebElement inscriptionInternetEmail = driver.findElement(By.xpath("//input[@id='internet-email']"));
        String inscription2 = inscriptionInternetEmail.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода Email варианта 'Домашний интернет': " + inscription2);
    }

    @Test
    public void instalment() {
        WebElement selectService = driver.findElement(By.xpath("//span[@class='select__arrow']"));
        selectService.click();
        WebElement instalment = driver.findElement(By.xpath("//li[3]/p[text()='Рассрочка']"));
        instalment.click();
        WebElement inscriptionInstalment = driver.findElement(By.xpath("//input[@id='score-instalment']"));
        String inscription = inscriptionInstalment.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода номера счёта варианта 'Рассрочка': " + inscription);
        WebElement inscriptionInstalmentSum = driver.findElement(By.xpath("//input[@id='instalment-sum']"));
        String inscription1 = inscriptionInstalmentSum.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода суммы варианта 'Рассрочка': " + inscription1);
        WebElement inscriptionInstalmentEmail = driver.findElement(By.xpath("//input[@id='instalment-email']"));
        String inscription2 = inscriptionInstalmentEmail.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода Email варианта 'Рассрочка': " + inscription2);

    }

    @Test
    public void arrears() {
        WebElement selectService = driver.findElement(By.xpath("//span[@class='select__arrow']"));
        selectService.click();
        WebElement userArrears = driver.findElement(By.xpath("//li[@class='select__item'][3]/p"));
        userArrears.click();
        WebElement inscriptionScoreArrears = driver.findElement(By.xpath("//input[@id='score-arrears']"));
        String inscription = inscriptionScoreArrears.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода номера счёта варианта 'Задолженность': " + inscription);
        WebElement inscriptionSumArrears = driver.findElement(By.xpath("//input[@id='arrears-sum']"));
        String inscription1 = inscriptionSumArrears.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода суммы варианта 'Задолженность': " + inscription1);
        WebElement inscriptionArrearsEmail = driver.findElement(By.xpath("//input[@id='arrears-email']"));
        String inscription2 = inscriptionArrearsEmail.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле для ввода Email варианта 'Задолженность': " + inscription2);

    }
}


