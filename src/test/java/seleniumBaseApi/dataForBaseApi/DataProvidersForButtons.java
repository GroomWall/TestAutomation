package seleniumBaseApi.dataForBaseApi;

import org.testng.annotations.DataProvider;

public class DataProvidersForButtons {
    @DataProvider(name = "XpathForButtons")
    public static Object[][] xpathForButtons() {
        return new Object[][]{
                {"//button[contains(text(),'Primary')]"},
                {"//button[contains(text(),'Success')]"},
                {"//button[contains(text(),'Info')]"},
                {"//button[contains(text(),'Warning')]"},
                {"//button[contains(text(),'Danger')]"},
                {"//button[contains(text(),'Link')]"},

                {"//button[contains(text(),'Left')]"},
                {"//button[contains(text(),'Middle')]"},
                {"//button[contains(text(),'Right')]"},

                {"//button[contains(text(),'1')]"},
                {"//button[contains(text(),'2')]"}
        };
    }

    @DataProvider(name = "XpathForDropdownItems")
    public static Object[][] xpathForDropdownItems() {
        return new Object[][]{
                {"//a[contains(text(),'Dropdown link 1')]"},
                {"//a[contains(text(),'Dropdown link 2')]"}
        };
    }
}
