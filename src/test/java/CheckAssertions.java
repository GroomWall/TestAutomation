import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class CheckAssertions {
    private final String exePath = "D:\\JetBrains\\Other\\Drivers\\chromedriver.exe";

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Google", driver.getTitle(), "Title not matching");
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Gooooogle", driver.getTitle(), "There is no title with such a name");
    }

    @Test
    public void test3(){
        String actual = "Hello";
        String expected = "Hi";
        Assert.assertEquals(actual, expected,"There is no match");
    }

    @Test
    public void test4(){
        String actual = "Hello";
        String expected = "Hi";
        Assert.assertEquals(actual, expected,"There is no match");
    }

    @Test
    public void test5(){
        Boolean actual = true;
        Boolean expected = false;
        Assert.assertEquals(actual, expected,"There is no match");
    }

    @Test
    public void test6(){
        Object actual = Collections.EMPTY_LIST;
        Object expected = Collections.EMPTY_LIST;
        Assert.assertEquals(actual, expected, "There is no match");
    }

    @Test
    public void test7(){
        Assert.assertTrue(5 > 3);
    }

    @Test
    public void test8(){
        Assert.assertTrue(5 > 3, "There is no match");
    }
    @Test
    public void test9(){
        Assert.assertFalse(5 > 3);
    }

    @Test
    public void test10(){
        Assert.assertFalse(5 > 3, "There is no match");
    }
}
