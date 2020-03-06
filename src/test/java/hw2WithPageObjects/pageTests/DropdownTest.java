package hw2WithPageObjects.pageTests;

import hw2WithPageObjects.pageObjects.DropdownPage;
import org.junit.Assert;
import org.junit.Test;
import webDriverSettings.WebDriverSettings;

import static org.junit.Assert.assertTrue;

public class DropdownTest extends WebDriverSettings {
    @Test
    public void dropdownTest(){
        driver.get("https://formy-project.herokuapp.com/dropdown");
        DropdownPage dropdownPage = new DropdownPage(driver);
        assertTrue(dropdownPage.isInitialized());
        Assert.assertTrue(dropdownPage.autocompleteVerification());
        Assert.assertTrue(dropdownPage.buttonsVerification());
        Assert.assertTrue(dropdownPage.checkboxVerification());
        Assert.assertTrue(dropdownPage.datepickerVerification());
        Assert.assertTrue(dropdownPage.dragAndDropVerification());
        Assert.assertTrue(dropdownPage.dropdownVerification());
        Assert.assertTrue(dropdownPage.enableAndDisableVerification());
        Assert.assertTrue(dropdownPage.fileUploadVerification());
        Assert.assertTrue(dropdownPage.fileDownloadVerification());
        Assert.assertTrue(dropdownPage.keyAndMouseVerification());
        Assert.assertTrue(dropdownPage.modalVerification());
        Assert.assertTrue(dropdownPage.pageScrollVerification());
        Assert.assertTrue(dropdownPage.radioButtonVerification());
        Assert.assertTrue(dropdownPage.switchWindowVerification());
        Assert.assertTrue(dropdownPage.completeWebFormVerification());
    }
}
