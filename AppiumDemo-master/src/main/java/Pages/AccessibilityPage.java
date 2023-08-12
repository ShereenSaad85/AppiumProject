package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccessibilityPage {
    WebDriver driver;

    public AccessibilityPage(WebDriver driver) {
        this.driver = driver;
    }

    //    ----------------------------Locators---------------------------
    private final By nodeQueryingLabel= AppiumBy.accessibilityId("Accessibility Node Querying");


    //    ----------------------------Actions---------------------------
    public AccessibilityPage clickOnNodeQueryLabel(){
        driver.findElement(nodeQueryingLabel).click();
        return this;
    }

    //    ----------------------------Locators of Assertions---------------------------
    private final By accessibilityNodeProviderLabel=AppiumBy.accessibilityId("Accessibility Node Provider");


    //    ----------------------------Actions of Assertions---------------------------
    public AccessibilityPage assertOnText(String text){
        String actualText=driver.findElement(accessibilityNodeProviderLabel).getText();
        Assert.assertEquals(actualText,text);
        return this;
    }


}
