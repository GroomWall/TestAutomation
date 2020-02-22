package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumBaseApi.dataForBaseApi.DataProviderForDropdown;
import webDriverSettings.WebDriverSettings;

public class DropdownNestedElementsClickTest extends WebDriverSettings {

    @Test(dataProvider = "DropdownPathsAndUrls", dataProviderClass = DataProviderForDropdown.class)
    public void dropdownButtonsUrlVerification(String path, String url) {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.xpath("//*[@id='dropdownMenuButton']"));
        element.click();
        element = driver.findElement(By.xpath(path));
        element.click();
        String url1 = driver.getCurrentUrl();
        Assert.assertEquals(url, url1, "Links are not equals");
    }

}
