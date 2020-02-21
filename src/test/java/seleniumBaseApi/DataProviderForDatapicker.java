package seleniumBaseApi;

import org.testng.annotations.DataProvider;

public class DataProviderForDatapicker {
    @DataProvider(name = "DatepickerData")
    public static Object[][] datepickerData() {
        return new Object[][]{
                {"April 2020", "12"},
                {"May 2020", "13"},
                {"May 2020", "14"},
                {"May 2020", "15"},
        };
    }
}
