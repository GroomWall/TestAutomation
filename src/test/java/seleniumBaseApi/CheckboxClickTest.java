package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumBaseApi.dataForBaseApi.DataProviderForCheckboxes;
import webDriverSettings.WebDriverSettings;

public class CheckboxClickTest extends WebDriverSettings {

    @Test(dataProvider = "CssSelectorsForCheckboxes", dataProviderClass = DataProviderForCheckboxes.class)
    public void checkboxTestWithTheHelpOfCssSelectors(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement element = driver.findElement(By.cssSelector(path));
        element.click();
        Thread.sleep(2000);
    }

    @Test(dataProvider = "XpathSelectorsForCheckboxes", dataProviderClass = DataProviderForCheckboxes.class)
    public void checkboxTestWithTheHelpOfXpathSelectors(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement element = driver.findElement(By.xpath(path));
        element.click();
        Thread.sleep(2000);
    }

}
