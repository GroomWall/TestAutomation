package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckboxTest extends WebDriverSettings {

    @Test(dataProvider = "CssSelectors", dataProviderClass = DataProviderForCheckboxes.class)
    public void testWithCss(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement element = driver.findElement(By.cssSelector(path));
        element.click();
        Thread.sleep(2000);
    }

    @Test(dataProvider = "XpathSelectors", dataProviderClass = DataProviderForCheckboxes.class)
    public void testWithXpath(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement element = driver.findElement(By.xpath(path));
        element.click();
        Thread.sleep(2000);
    }

}
