package seleniumBaseApi;

import org.testng.annotations.DataProvider;

public class CssDataProvidersForButtons {
    @DataProvider(name = "CssPaths")
    public static Object[][] cssPaths() {
        return new Object[][]{
                {"form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-primary"},
                {"form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-success"},
                {"form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-info"},
                {"form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-warning"},
                {"form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-danger"},
                {"form > div:nth-child(1) > div > div > button.btn.btn-lg.btn-link"},

                {"form > div:nth-child(2) > div > div > div > button:nth-child(1)"},
                {"form > div:nth-child(2) > div > div > div > button:nth-child(2)"},
                {"form > div:nth-child(2) > div > div > div > button:nth-child(3)"},

                {"form > div:nth-child(3) > div > div > div > button:nth-child(1)"},
                {"form > div:nth-child(3) > div > div > div > button:nth-child(2)"}
        };
    }

    @DataProvider(name = "SelectElements")
    public static Object[][] cssPaths2() {
        return new Object[][]{
                {"form > div:nth-child(3) > div > div > div > div > div > a:nth-child(1)"},
                {"form > div:nth-child(3) > div > div > div > div > div > a:nth-child(2)"}
        };
    }
}
