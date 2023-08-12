package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NodeQueryingPage {
    WebDriver driver;

    public NodeQueryingPage(WebDriver driver) {
        this.driver = driver;
    }
    //    ----------------------------Locators---------------------------
    private final By checkBoxField= AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Task Conquer World\"]//parent::android.widget.LinearLayout/android.widget.CheckBox");
    private final By checkedBox=AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Task Conquer World\"]//parent::android.widget.LinearLayout/android.widget.CheckBox");

    //    ----------------------------Actions---------------------------
    public NodeQueryingPage clickOnCheckBoxField(){
        driver.findElement(checkBoxField).click();
        return this;
    }
    public NodeQueryingPage assertOnIfTheBoxChecked(){
        Assert.assertTrue(Boolean.parseBoolean(driver.findElement(checkedBox).getAttribute("checked")));
        return this;

    }
}
