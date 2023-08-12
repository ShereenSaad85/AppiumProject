import Actions.MobileActions;
import Pages.*;
import Utils.JsonFileManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test_MobileActions {
    WebDriver driver;
    JsonFileManager testData = new JsonFileManager("src//test//resources//TestDataFiles//TestData.json");

    @BeforeMethod
    public void setup() throws MalformedURLException{
        TestConfigurations testConfigurations=new TestConfigurations();
        driver=testConfigurations.setupDevice();
    }



    @Test
    public void testClickAction() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage(driver).clickOnAccessabilityLabel();
        new AccessibilityPage(driver)
                .assertOnText(testData.getTestData("AccessabilityNodeProvider"));
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage(driver).clickOnAppLabel();
        new AppPage(driver).clickOnActivityLabel();
        new ActivityPage(driver).clickOnCustomTitleLabel();
        new CustomTitlePage(driver)
                .clearAndType(testData.getTestData("LeftText"))
                .clickOnChangeButton()
                .assertOnTheLeftText(testData.getTestData("LeftText"));
//

    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage(driver).clickOnAccessabilityLabel();
        new AccessibilityPage(driver).clickOnNodeQueryLabel();
        new NodeQueryingPage(driver)
                .clickOnCheckBoxField()
                .assertOnIfTheBoxChecked();
    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage(driver).clickOnGraphicsLabel();
        new GraphicsPage(driver)
                .scrollDownToSpecificLabel(testData.getTestData("ScrollDownToScaleToFitLabel"))
                .clickOnScaleToFit()
                .assertOnScrolling(testData.getTestData("AssertOnGraphics/ScaleToFit"));
    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage(driver)
                .clickOnGraphicsLabel();
        new GraphicsPage(driver)
                .scrollDownToSpecificLabel(testData.getTestData("ScrollDownToVertices"))
                .clickOnVertices();
        new VerticesPage(driver).swipeTheImage();
}

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage(driver).clickOnViewsLabel();
        new ViewsPage(driver).scrollDownToSpecificLabel(testData.getTestData("ScrollDownToVerticesRadioGroup"));
        new RadioButtonPage(driver)
                .clickOnRadioGroupLabel()
                .clickOnAnyRadioButton()
                .assertOnIfRadioButtonIsChecked();



    }

    @AfterMethod
    public void tearDown(){
        TestConfigurations testConfigurations=new TestConfigurations();
        testConfigurations.tearDown();
    }

}
