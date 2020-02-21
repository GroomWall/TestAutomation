package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DatepickerTest extends WebDriverSettings {

    @Test(dataProvider = "DatepickerData", dataProviderClass = DataProviderForDatapicker.class)
    public void dateTest(String month, String day) {
        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        while (true) {
            String text = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/thead[1]/tr[2]/th[2]")).getText();
            if (text.equals(month)) {
                break;
            } else {
                driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]")).click();
            }
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day + ")]"));
    }
}
