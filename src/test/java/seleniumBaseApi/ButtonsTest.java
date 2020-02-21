package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ButtonsTest {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "CssPaths", dataProviderClass = CssDataProvidersForButtons.class)
    public void test1(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/buttons");
        WebElement buttonElement = driver.findElement(By.cssSelector(path));
        Thread.sleep(1000);
        buttonElement.click();
    }

    @Test(dataProvider = "SelectElements", dataProviderClass = CssDataProvidersForButtons.class)
    public void test2(String path) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/buttons");
        WebElement element = driver.findElement(By.id("btnGroupDrop1"));
        element.click();
        Thread.sleep(3000);
        element = driver.findElement(By.cssSelector(path));
        element.click();
    }

    @AfterTest
    public void autoQuit() {
        driver.quit();
    }
}
