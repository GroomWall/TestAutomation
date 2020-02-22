package seleniumBaseApi.dataForBaseApi;

import org.testng.annotations.DataProvider;

public class DataProviderForDropdown {
    @DataProvider(name = "DropdownPathsAndUrls")
    public static Object[][] dropdownPathsAndUrls() {
        return new Object[][]{
                {"//*[@id='autocomplete']", "https://formy-project.herokuapp.com/autocomplete"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Buttons')]", "https://formy-project.herokuapp.com/buttons"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Checkbox')]", "https://formy-project.herokuapp.com/checkbox"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Datepicker')]", "https://formy-project.herokuapp.com/datepicker"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Drag and Drop')]", "https://formy-project.herokuapp.com/dragdrop"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Dropdown')]", "https://formy-project.herokuapp.com/dropdown"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Enabled and disabled elements')]", "https://formy-project.herokuapp.com/enabled"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'File Upload')]", "https://formy-project.herokuapp.com/fileupload"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'File Download')]", "https://formy-project.herokuapp.com/filedownload"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Key and Mouse Press')]", "https://formy-project.herokuapp.com/keypress"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Modal')]", "https://formy-project.herokuapp.com/modal"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Page Scroll')]", "https://formy-project.herokuapp.com/scroll"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Radio Button')]", "https://formy-project.herokuapp.com/radiobutton"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Switch Window')]", "https://formy-project.herokuapp.com/switch-window"},
                {"//div[@class='dropdown-menu show']//*[contains(text(),'Complete Web Form')]", "https://formy-project.herokuapp.com/form"},
        };
    }
}
