package by.st.selenide_appium_demo.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CalculatorPage {

    public SelenideElement calculator = $(By.id("main_calculator"));
    public SelenideElement numberOne = $(By.id("digit_1"));
    public SelenideElement numberTwo = $(By.id("digit_2"));
    public SelenideElement buttonPlus = $(By.id("op_add"));
    public SelenideElement buttonMultiply = $(By.id("op_mul"));
    public SelenideElement buttonEqual = $(By.id("eq"));
    public SelenideElement buttonDivision = $(By.id("op_div"));
    public SelenideElement result = $(By.id("result_final"));

    @Step("Calculator open")
    public CalculatorPage isPageOpened() {
        calculator.isDisplayed();
        return this;
    }

    @Step("Find the sum of numbers")
    public CalculatorPage findAmount() {
        numberOne.isDisplayed();
        numberOne.click();
        buttonPlus.isDisplayed();
        buttonPlus.click();
        numberTwo.click();
        buttonEqual.click();
        return this;
    }

    @Step("Find the product of numbers")
    public CalculatorPage findMultiplication() {
        numberOne.isDisplayed();
        numberOne.click();
        buttonMultiply.isDisplayed();
        buttonMultiply.click();
        numberTwo.click();
        buttonEqual.click();
        return this;
    }

    @Step("Find division of numbers")
    public CalculatorPage findDivision() {
        numberOne.isDisplayed();
        numberTwo.click();
        buttonDivision.isDisplayed();
        buttonDivision.click();
        numberOne.click();
        buttonEqual.click();
        return this;
    }
}
