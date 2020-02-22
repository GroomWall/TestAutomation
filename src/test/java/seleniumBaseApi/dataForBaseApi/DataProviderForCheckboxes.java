package seleniumBaseApi.dataForBaseApi;

import org.testng.annotations.DataProvider;

public class DataProviderForCheckboxes {
    @DataProvider(name = "CssSelectorsForCheckboxes")
    public static Object[][] cssSelectorsForCheckboxes() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"}
        };
    }

    @DataProvider(name = "XpathSelectorsForCheckboxes")
    public static Object[][] xpathSelectorsForCheckboxes() {
        return new Object[][]{
                {"//*[@id='checkbox-1']"},
                {"//*[@id='checkbox-2']"},
                {"//*[@id='checkbox-3']"}
        };
    }
}
