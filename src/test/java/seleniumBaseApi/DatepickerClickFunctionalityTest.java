package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import seleniumBaseApi.dataForBaseApi.DataProviderForDatepicker;
import webDriverSettings.WebDriverSettings;

public class DatepickerClickFunctionalityTest extends WebDriverSettings {

    @Test(dataProvider = "DatepickerData", dataProviderClass = DataProviderForDatepicker.class)
    public void clickOnCalendarDate(String month, String day) {
        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        while (true) {
            String text = driver.findElement(By.xpath("//*[@class='datepicker-switch'][contains(text(),' ')]")).getText();
            if (text.equals(month)) {
                break;
            } else {
                driver.findElement(By.xpath("//div[@class='datepicker-days']//th[contains(text(),'»')]")).click();
            }
        }
        driver.findElement(By.xpath("//tr//td[contains(text(),'" + day + "')]"));
    }
}
