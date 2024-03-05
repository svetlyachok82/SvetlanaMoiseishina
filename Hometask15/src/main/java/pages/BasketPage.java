package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static common.Config.Timeouts.implicitWait;

public class BasketPage {
    private WebDriver driver;

    public static void checkBasket(WebDriver driver) {

        By productNameSelector = By.xpath("//div[@class='list-item__good-info good-info']");
        By productQuantitySelector = By.xpath("//input[@type='number']");
        By productPriceSelector = By.xpath("//div[@class='list-item__price-new wallet']");

        By totalPriceSelector = By.xpath("//span[@class='b-right']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(implicitWait));

        List<WebElement> productNames = driver.findElements(productNameSelector);
        List<WebElement> productQuantities = driver.findElements(productQuantitySelector);
        List<WebElement> productPrices = driver.findElements(productPriceSelector);
        WebElement totalPriceElement = driver.findElement(totalPriceSelector);

// Проверка количества товаров в корзине
        int actualItemCount = productNames.size();
        Assertions.assertTrue(actualItemCount > 0, "Корзина пуста");

// Проверка соответствия вида и количества товаров
        List<Integer> actualProductQuantities = new ArrayList<>();
        for (WebElement quantityElement : productQuantities) {
            int quantity = Integer.parseInt(quantityElement.getAttribute("value"));
            Assertions.assertTrue(quantity > 0, "Неверное количество товара");
            actualProductQuantities.add(quantity);

        }

// Проверка соответствия типу данных и значений цен товаров
        List<Double> actualProductPrices = new ArrayList<>();
        for (WebElement priceElement : productPrices) {
            double price = Double.parseDouble(priceElement.getText().replaceAll("[^0-9.,]+", "").replace(",", "."));
            Assertions.assertTrue(price > 0, "Неверная цена товара");
            actualProductPrices.add(price);

        }

// Проверка общей суммы товаров
        double expectedTotalPrice = actualProductPrices.stream().mapToDouble(Double::doubleValue).sum();
        double actualTotalPrice = Double.parseDouble(totalPriceElement.getText().replaceAll("[^0-9.,]+", "").replace(",", "."));
        Assertions.assertEquals(expectedTotalPrice, actualTotalPrice, 0.01, "Неверная общая сумма товаров");

    }


}







