package Utilis;

import org.openqa.selenium .*;
import io.appium.java_client.AppiumDriver;

public class AndroidUtils {

        private AppiumDriver driver;


        public AndroidUtils(AppiumDriver driver) {
            this.driver = driver;
        }

        public void waitFor(long milliSeconds) {
            try {
                Thread.sleep(milliSeconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        public Boolean objectExists(By by) {
            try {
                if (driver.findElements(by).size() == 0) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                return false;
            }
        }


        public String getElementText(By by) {
            if (driver.findElement(by).isDisplayed()) {
                return driver.findElement(by).getText();
            } else {
                throw new ElementNotVisibleException("Element Not Found");
            }
        }
    }