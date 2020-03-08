package hw2WithPageObjects.pageTests;

import hw2WithPageObjects.pageObjects.CompleteWebFormPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ReceiptPage;
import webDriverSettings.WebDriverSettings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CompleteWebFormTest extends WebDriverSettings {
    private final String name = "First";
    private final String lastName = "Last";
    private final String expectedResultAfterFormWasCompleted = "Thanks for submitting your form";
    @Test
    public void completeWebFormTest() {
        driver.get("https://formy-project.herokuapp.com/form");
        CompleteWebFormPage completeWebFormPage = new CompleteWebFormPage(driver);
        assertTrue(completeWebFormPage.isInitialized());

        completeWebFormPage.enterName(name, lastName);
        completeWebFormPage.enterJobTitle("Here should be job title");

        completeWebFormPage.setCheckbox1();
        completeWebFormPage.setRadioButton1();

        ReceiptPage receiptPage = completeWebFormPage.submit();
        assertTrue(receiptPage.isInitialized());
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
        assertEquals(expectedResultAfterFormWasCompleted, receiptPage.confirmationHeader());
    }
}
