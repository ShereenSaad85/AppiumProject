package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;
    MobileActions ma;

    public ViewsPage(WebDriver driver) {
        this.driver = driver;
    }
    //    ----------------------------Locators---------------------------
    private final By scaleToFitLabel= AppiumBy.accessibilityId("ScaleToFit");
    private final By verticesLabel=AppiumBy.accessibilityId("Vertices");

    //    ----------------------------Actions---------------------------
    public ViewsPage scrollDownToSpecificLabel(String text){
        ma=new MobileActions(driver);
        ma.scrollDownToSpecificText(text);
        return this;
    }
}
