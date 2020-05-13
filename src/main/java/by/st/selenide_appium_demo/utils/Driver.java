package by.st.selenide_appium_demo.utils;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public AndroidDriver driver;
    protected static Logger logger = Logger.getLogger();

    @BeforeClass
    @Parameters({"deviceName", "platformVersion", "systemPort"})
    @Step("Set Up - get WebDriver")
    public WebDriver getDriver(String deviceName, String platformVersion, String systemPort) throws MalformedURLException {
            logger.info("Set capabilities");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("platformVersion", platformVersion);
            capabilities.setCapability("systemPort", systemPort);
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.google.android.calculator");
            capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("noReset", false);
            capabilities.setCapability("unicodeKeyboard", true);
            capabilities.setCapability("resetKeyboard", true);
            logger.info("Init driver");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
