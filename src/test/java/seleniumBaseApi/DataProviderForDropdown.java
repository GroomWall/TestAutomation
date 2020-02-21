package seleniumBaseApi;

import org.testng.annotations.DataProvider;

public class DataProviderForDropdown {
    @DataProvider(name = "DropdownData")
    public static Object[][] dropdownPaths() {
        return new Object[][]{
                {"//*[@id='autocomplete']", "https://formy-project.herokuapp.com/autocomplete"},
                {"/html/body/div/div/div/a[2]", "https://formy-project.herokuapp.com/buttons"},
                {"/html/body/div/div/div/a[3]", "https://formy-project.herokuapp.com/checkbox"},
                {"/html/body/div/div/div/a[4]", "https://formy-project.herokuapp.com/datepicker"},
                {"/html/body/div/div/div/a[5]", "https://formy-project.herokuapp.com/dragdrop"},
                {"/html/body/div/div/div/a[6]", "https://formy-project.herokuapp.com/dropdown"},
                {"/html/body/div/div/div/a[7]", "https://formy-project.herokuapp.com/enabled"},
                {"/html/body/div/div/div/a[8]", "https://formy-project.herokuapp.com/fileupload"},
                {"/html/body/div/div/div/a[9]", "https://formy-project.herokuapp.com/filedownload"},
                {"/html/body/div/div/div/a[10]", "https://formy-project.herokuapp.com/keypress"},
                {"/html/body/div/div/div/a[11]", "https://formy-project.herokuapp.com/modal"},
                {"/html/body/div/div/div/a[12]", "https://formy-project.herokuapp.com/scroll"},
                {"/html/body/div/div/div/a[13]", "https://formy-project.herokuapp.com/radiobutton"},
                {"/html/body/div/div/div/a[14]", "https://formy-project.herokuapp.com/switch-window"},
                {"/html/body/div/div/div/a[15]", "https://formy-project.herokuapp.com/form"},
        };
    }

//    @DataProvider(name="UrlToVerify")
//    public static Object[][] urlToVerify() {
//        return new Object[][]{
//                {},
//                {},
//                {},
//                {},
//                {},
//                {},
//        };
//    }
}
