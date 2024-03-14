import io.qameta.allure.Allure;
import org.example.DriverInitializer;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestListener{

    public void testSuccessful(ExtensionContext context){
        Allure.getLifecycle().addAttachment("Скриншот после успешного прохождения теста",
                "image/png","png",((TakesScreenshot) DriverInitializer.driver).getScreenshotAs(OutputType.BYTES));
    }
}
