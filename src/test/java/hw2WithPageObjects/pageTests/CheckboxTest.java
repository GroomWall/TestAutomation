package hw2WithPageObjects.pageTests;

import hw2WithPageObjects.pageObjects.CheckboxPage;
import org.junit.Test;
import webDriverSettings.WebDriverSettings;

import static org.junit.Assert.assertTrue;

public class CheckboxTest extends WebDriverSettings {
    @Test
    public void checkboxTest() {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxPage checkboxPage = new CheckboxPage(driver);
        assertTrue(checkboxPage.isInitialized());
        checkboxPage.checkbox1();
        checkboxPage.checkbox2();
        checkboxPage.checkbox3();
    }
}
