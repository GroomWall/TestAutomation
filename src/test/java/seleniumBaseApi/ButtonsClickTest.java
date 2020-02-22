package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import seleniumBaseApi.dataForBaseApi.DataProvidersForButtons;
import webDriverSettings.WebDriverSettings;

public class ButtonsClickTest extends WebDriverSettings {
    @Test(dataProvider = "XpathForButtons", dataProviderClass = DataProvidersForButtons.class)
    public void buttonsClickSimulation(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/buttons");
        WebElement buttonElement = driver.findElement(By.xpath(path));
        buttonElement.click();
        Thread.sleep(2000);
    }

    @Test(dataProvider = "XpathForDropdownItems", dataProviderClass = DataProvidersForButtons.class)
    public void dropdownButtonElementsClickSimulation(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/buttons");
        WebElement element = driver.findElement(By.id("btnGroupDrop1"));
        element.click();
        element = driver.findElement(By.xpath(path));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        Thread.sleep(2000);
    }
}
