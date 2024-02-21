package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import Utilis.AndroidUtils;
import Utilis.AppiumDriverFactory;

public class MoviesPage {

    AppiumDriver driver = null;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    /**
     * locate Page Objects
     **/

    private static final By app_Home_Title = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    private String selectedMovie = "(//android.widget.ImageView[@content-desc=\"image poster\"])[2]";

    public void launchApp() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        if (androidUtils.objectExists(app_Home_Title)) {
            System.out.println("Application Launched!");
            Assert.assertTrue(true, "Application Launched Successfully!");
        } else {
            Assert.assertTrue(false, "Unable to launch application!");
        }

    }

    public void OpenMovieDetails() {
        MobileElement movieElement = (MobileElement) driver.findElementByXPath(selectedMovie);
        movieElement.click();
    }

    public void validateDetails() {
        if (androidUtils.objectExists(By.xpath(selectedMovie)))
            Assert.assertTrue(true, "I am in Movie Details Screen");
        else
            Assert.assertTrue(false, "failed to be in Movie Details Screen");
    }
}

