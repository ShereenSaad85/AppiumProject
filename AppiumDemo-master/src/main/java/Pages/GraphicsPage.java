package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GraphicsPage {
    WebDriver driver;
    MobileActions ma;

    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
    }
    //    ----------------------------Locators---------------------------
    private final By scaleToFitLabel= AppiumBy.accessibilityId("ScaleToFit");
    private final By verticesLabel=AppiumBy.accessibilityId("Vertices");
    private final By scrollChecked=AppiumBy.className("android.widget.TextView");

    //    ----------------------------Actions---------------------------
    public GraphicsPage scrollDownToSpecificLabel(String text){
        ma=new MobileActions(driver);
        ma.scrollDownToSpecificText(text);
        return this;
    }
    public GraphicsPage clickOnScaleToFit(){
        driver.findElement(scaleToFitLabel).click();
        return this;
    }
    public GraphicsPage clickOnVertices(){
        driver.findElement(verticesLabel).click();
        return this;
    }
    public GraphicsPage assertOnScrolling(String text){
        Assert.assertEquals(driver.findElement(scrollChecked).getText(), text);
        return this;

    }


}
