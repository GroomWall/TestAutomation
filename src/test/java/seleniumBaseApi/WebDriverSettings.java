package seleniumBaseApi;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverSettings {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void autoQuit() {
        driver.quit();
    }
}
