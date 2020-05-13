package by.st.selenide_appium_demo.test;

import by.st.selenide_appium_demo.page.CalculatorPage;
import by.st.selenide_appium_demo.utils.Driver;
import by.st.selenide_appium_demo.utils.Logger;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Prepare extends Driver {
    CalculatorPage calculatorPage = new CalculatorPage();
    public static Logger logger = Logger.getLogger();

    @BeforeSuite
    @Step("Set Up Allure - add SelenideLogger")
    public void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @BeforeClass
    @Step("Set Up - set WebDriver")
    public void setUp() {
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterSuite
    @Step("Tear Down - remove SelenideLogger")
    public void tearDown() {
        SelenideLogger.removeListener("allure");
    }
}
