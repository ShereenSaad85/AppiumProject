package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticesPage {
    WebDriver driver;
    MobileActions ma;

    public VerticesPage(WebDriver driver) {
        this.driver = driver;

    }

    //    ----------------------------Locators---------------------------
    private final By image=AppiumBy.xpath("//android.view.View");

    //    ----------------------------Actions---------------------------
    public VerticesPage swipeTheImage(){
        ma=new MobileActions(driver);
        ma.swipeRightOnElement(image,driver);
        ma.swipeLeftOnElement(image);
        return this;
    }
}
