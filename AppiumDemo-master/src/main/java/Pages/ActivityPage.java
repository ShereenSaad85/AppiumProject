package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    WebDriver driver;


    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }

    //    ----------------------------Locators---------------------------
    private final By CustomTitleLabel= AppiumBy.accessibilityId("Custom Title");


    //    ----------------------------Actions---------------------------
    public ActivityPage clickOnCustomTitleLabel(){
        driver.findElement(CustomTitleLabel).click();
        return this;
    }
}
