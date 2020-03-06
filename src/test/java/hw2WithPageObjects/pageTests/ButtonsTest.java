package hw2WithPageObjects.pageTests;

import hw2WithPageObjects.pageObjects.ButtonsPage;
import org.junit.Test;
import webDriverSettings.WebDriverSettings;

import static org.junit.Assert.assertTrue;

public class ButtonsTest extends WebDriverSettings {
    @Test
    public void buttonsTest() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        assertTrue(buttonsPage.isInitialized());
        buttonsPage.primary();
        buttonsPage.success();
        buttonsPage.info();
        buttonsPage.warning();
        buttonsPage.danger();
        buttonsPage.link();
        buttonsPage.left();
        buttonsPage.middle();
        buttonsPage.right();
        buttonsPage.press1();
        buttonsPage.press2();
        buttonsPage.dropdownLink1();
        buttonsPage.dropdownLink2();
    }
}
