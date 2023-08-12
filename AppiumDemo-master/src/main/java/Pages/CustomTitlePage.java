package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomTitlePage {
    WebDriver driver;


    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
    }

    //    ----------------------------Locators---------------------------
    private final By inputField= AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    private final By changeButton= AppiumBy.accessibilityId("Change Left");

    //----------------------------Locators of Assertions---------------------------
    private final By leftText=AppiumBy.id("io.appium.android.apis:id/left_text");
    //    ----------------------------Actions---------------------------
    public CustomTitlePage clearAndType(String text){
        driver.findElement(inputField).clear();
        driver.findElement(inputField).sendKeys(text);
        return this;
    }
    public CustomTitlePage clickOnChangeButton(){
        driver.findElement(changeButton).click();
        return this;
    }
    //----------------------------Actions of Assertions---------------------------
    public CustomTitlePage assertOnTheLeftText(String text){
        Assert.assertEquals(driver.findElement(leftText).getText(),text);
        return this;
    }

}
