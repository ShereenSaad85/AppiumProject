package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioButtonPage {
    WebDriver driver;
    MobileActions ma;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }
    //    ----------------------------Locators---------------------------
    private final By radioGroupLabel=AppiumBy.accessibilityId("Radio Group");
    private final By breakfastLabel=AppiumBy.accessibilityId("Breakfast");
//    private final By radioButtonChecked=AppiumBy.accessibilityId("Breakfast");


    //    ----------------------------Actions---------------------------
    public RadioButtonPage scrollDownToSpecificLabel(String text){
        ma=new MobileActions(driver);
        ma.scrollDownToSpecificText(text);
        return this;
    }
    public RadioButtonPage clickOnRadioGroupLabel(){
        driver.findElement(radioGroupLabel).click();
        return this;
    }
    public RadioButtonPage clickOnAnyRadioButton(){
        driver.findElement(breakfastLabel).click();
        return this;
    }
    public RadioButtonPage assertOnIfRadioButtonIsChecked(){
        Assert.assertEquals(driver.findElement(breakfastLabel).getAttribute("checked"),("true"));
        return this;

    }

}
