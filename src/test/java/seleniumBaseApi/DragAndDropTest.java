package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest extends WebDriverSettings {
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement fromHere = driver.findElement(By.xpath("//*[@id=\"image\"]"));
        WebElement toHere = driver.findElement(By.xpath("//*[@id=\"box\"]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(fromHere, toHere).build().perform();
        Thread.sleep(3000);
    }

//    @Test
//    public void dragAndDrop() throws InterruptedException {
//        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//        WebElement from = driver.findElement(By.xpath("//*[@id='box1']"));
//        WebElement To = driver.findElement(By.xpath("//*[@id=\"box101\"]"));
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(from,To).perform();
//        Thread.sleep(4000);
//    }
}
