package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppPage {
    WebDriver driver;

    public AppPage(WebDriver driver) {
        this.driver = driver;
    }
    //    ----------------------------Locators---------------------------
    private final By ActivityLabel= AppiumBy.accessibilityId("Activity");


    //    ----------------------------Actions---------------------------
    public AppPage clickOnActivityLabel(){
        driver.findElement(ActivityLabel).click();
        return this;
    }
}
