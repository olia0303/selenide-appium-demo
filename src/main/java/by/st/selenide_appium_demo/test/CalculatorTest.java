package by.st.selenide_appium_demo.test;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class CalculatorTest extends Prepare {

    @Test
    public void countAmountTest() {
        calculatorPage.isPageOpened();
        calculatorPage.findAmount();
        calculatorPage.result.shouldHave(text("3"));
    }

    @Test
    public void countMultiplicationTest() {
        calculatorPage.isPageOpened();
        calculatorPage.findMultiplication();
        calculatorPage.result.shouldHave(text("2"));
    }

    @Test
    public void countDivisionTest() {
        calculatorPage.isPageOpened();
        calculatorPage.findDivision();
        calculatorPage.result.shouldHave(text("2"));
    }
}

