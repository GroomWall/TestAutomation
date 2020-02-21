package seleniumBaseApi;

import org.testng.annotations.DataProvider;

public class DataProviderForCheckboxes {
    @DataProvider(name = "CssSelectors")
    public static Object[][] cssPaths() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"}
        };
    }

    @DataProvider(name = "XpathSelectors")
    public static Object[][] xpathSelectors() {
        return new Object[][]{
                {"//*[@id='checkbox-1']"},
                {"//*[@id='checkbox-2']"},
                {"//*[@id='checkbox-3']"}
        };
    }
}
