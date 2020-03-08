package hw2WithPageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.PageObject;

public class DropdownPage extends PageObject {
    @FindBy(id = "dropdownMenuButton")
    private WebElement dropdownMenuButton;

    @FindBy(xpath = "//*[@id='autocomplete']")
    private WebElement autocomplete;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Buttons')]")
    private WebElement buttons;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Checkbox')]")
    private WebElement checkbox;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Datepicker')]")
    private WebElement datepicker;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Drag and Drop')]")
    private WebElement dragAndDrop;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Dropdown')]")
    private WebElement dropDown;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Enabled and disabled elements')]")
    private WebElement enabledAndDisabled;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'File Upload')]")
    private WebElement fileUpload;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'File Download')]")
    private WebElement fileDownload;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Key and Mouse Press')]")
    private WebElement keyAndMouse;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Modal')]")
    private WebElement modal;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Page Scroll')]")
    private WebElement pageScroll;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Radio Button')]")
    private WebElement radioButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Switch Window')]")
    private WebElement switchWindow;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//*[contains(text(),'Complete Web Form')]")
    private WebElement completeWebForm;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return dropdownMenuButton.isDisplayed();
    }

    private void setUpDropdown(WebElement element){
        dropdownMenuButton.click();
        element.click();
    }
    public boolean autocompleteVerification() {
        setUpDropdown(autocomplete);
        String urlExpected = "https://formy-project.herokuapp.com/autocomplete";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean buttonsVerification() {
        setUpDropdown(buttons);
        String urlExpected = "https://formy-project.herokuapp.com/buttons";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean checkboxVerification() {
        setUpDropdown(checkbox);
        String urlExpected = "https://formy-project.herokuapp.com/checkbox";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }


    public boolean datepickerVerification() {
        setUpDropdown(datepicker);
        String urlExpected = "https://formy-project.herokuapp.com/datepicker";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean dragAndDropVerification() {
        setUpDropdown(dragAndDrop);
        String urlExpected = "https://formy-project.herokuapp.com/dragdrop";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean dropdownVerification() {
        setUpDropdown(dropDown);
        String urlExpected = "https://formy-project.herokuapp.com/dropdown";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean enableAndDisableVerification() {
        setUpDropdown(enabledAndDisabled);
        String urlExpected = "https://formy-project.herokuapp.com/enabled";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean fileUploadVerification() {
        setUpDropdown(fileUpload);
        String urlExpected = "https://formy-project.herokuapp.com/fileupload";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean fileDownloadVerification() {
        setUpDropdown(fileDownload);
        String urlExpected = "https://formy-project.herokuapp.com/filedownload";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean keyAndMouseVerification() {
        setUpDropdown(keyAndMouse);
        String urlExpected = "https://formy-project.herokuapp.com/keypress";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean modalVerification() {
        setUpDropdown(modal);
        String urlExpected = "https://formy-project.herokuapp.com/modal";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean pageScrollVerification() {
        setUpDropdown(pageScroll);
        String urlExpected = "https://formy-project.herokuapp.com/scroll";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean radioButtonVerification() {
        setUpDropdown(radioButton);
        String urlExpected = "https://formy-project.herokuapp.com/radiobutton";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean switchWindowVerification() {
        setUpDropdown(switchWindow);
        String urlExpected = "https://formy-project.herokuapp.com/switch-window";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean completeWebFormVerification() {
        setUpDropdown(completeWebForm);
        String urlExpected = "https://formy-project.herokuapp.com/form";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }
}
