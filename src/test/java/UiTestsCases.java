
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;

    public class UiTestsCases {
        String exePath = "D:\\JetBrains\\Drivers\\chromedriver.exe";
        @Test
        public void verifyString() {
            System.setProperty("webdriver.chrome.driver", exePath);
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.youtube.com/");
        }
    }


