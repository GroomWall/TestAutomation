package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import webDriverSettings.WebDriverSettings;

public class DragAndDropFunctionalityTest extends WebDriverSettings {
    @Test
    public void dragAndDropFunctionalityTest() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement fromHere = driver.findElement(By.xpath("//*[@id='image']"));
        WebElement toHere = driver.findElement(By.xpath("//*[@id='box']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(fromHere, toHere).build().perform();
        Thread.sleep(3000);
    }
}
