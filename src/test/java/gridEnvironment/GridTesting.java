package gridEnvironment;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTesting {
    @Test
    public void gridInitializationTest() throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setPlatform(Platform.WINDOWS);
        URL url = new URL("http://localhost:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url,cap);
        driver.get("http://google.com");
        String actual = driver.getTitle();
        String expected = "Google";
        Assert.assertEquals(actual,expected);
        driver.quit();
    }
}
