package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.BasketPage;
import pages.ChooseSizePage;
import java.time.Duration;
import static common.Config.Timeouts.explicitWait;


public class MainWBTest extends BasePage {
    private By sizePopup;
    private By sizeButton;

    @Test
    public void testsMain() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
        /*Находит и нажимает на элемент product1. Ожидает появления окна выбора размера и выбирает размер с помощью
        метода selectSize(). Если окно размера не появилось - сообщает об этом.*/
        WebElement product1 = driver.findElement(By.xpath("//main[@id='body-layout']//div[@id='mainContainer']//article[1]//div[@class='product-card__bottom-wrap']//p[3]/a"));
        product1.click();
        ChooseSizePage.selectSize(driver, sizePopup, sizeButton);

        /*Находит и нажимает на элемент product2. Ожидает появления окна выбора размера и выбирает размер с помощью
         метода selectSize(). Если окно размера не появилось - сообщает об этом*/
        WebElement product2 = driver.findElement(By.xpath("//main[@id='body-layout']//div[@id='mainContainer']//article[2]//div[@class='product-card__bottom-wrap']//p[3]/a"));
        product2.click();
        ChooseSizePage.selectSize(driver, sizePopup, sizeButton);

        //Находит и нажимает на элемент Корзина
        WebElement basket = driver.findElement(By.xpath("//a[@data-wba-header-name='Cart']"));
        basket.click();

        BasketPage.checkBasket(driver);
    }
}








