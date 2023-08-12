package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //    ----------------------------Locators---------------------------
    private final By AccessabilityLabel= AppiumBy.accessibilityId("Access'ibility");
    private final By AppLabel= AppiumBy.accessibilityId("App");
    private final By GraphicsLabel= AppiumBy.accessibilityId("Graphics");
    private final By ViewsLabel= AppiumBy.accessibilityId("Views");


    //    ----------------------------Actions---------------------------
    public HomePage clickOnAccessabilityLabel(){
        driver.findElement(AccessabilityLabel).click();
        return this;
    }
    public HomePage clickOnAppLabel(){
        driver.findElement(AppLabel).click();
        return this;
    }
    public HomePage clickOnGraphicsLabel(){
        driver.findElement(GraphicsLabel).click();
        return this;
    }
    public HomePage clickOnViewsLabel(){
        driver.findElement(ViewsLabel).click();
        return this;
    }

}
