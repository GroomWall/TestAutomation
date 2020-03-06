package hw2WithPageObjects.pageTests;

import hw2WithPageObjects.pageObjects.CompleteWebFormPage;
import org.junit.Test;
import pageObject.ReceiptPage;
import webDriverSettings.WebDriverSettings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CompleteWebFormTest extends WebDriverSettings {
    @Test
    public void completeWebFormTest() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/form");
        CompleteWebFormPage completeWebFormPage = new CompleteWebFormPage(driver);
        assertTrue(completeWebFormPage.isInitialized());

        completeWebFormPage.enterName("First", "Last");
        completeWebFormPage.enterJobTitle("Here should be job title");

        completeWebFormPage.setCheckbox1();
        completeWebFormPage.setRadioButton1();

        ReceiptPage receiptPage = completeWebFormPage.submit();
        assertTrue(receiptPage.isInitialized());
        Thread.sleep(2000);
        assertEquals("Thanks for submitting your form", receiptPage.confirmationHeader());
    }
}
