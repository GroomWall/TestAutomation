package hw2WithPageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
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

    public boolean autocompleteVerification(){
        dropdownMenuButton.click();
        autocomplete.click();
        String urlExpected = "https://formy-project.herokuapp.com/autocomplete";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean buttonsVerification(){
        dropdownMenuButton.click();
        buttons.click();
        String urlExpected = "https://formy-project.herokuapp.com/buttons";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean checkboxVerification(){
        dropdownMenuButton.click();
        checkbox.click();
        String urlExpected = "https://formy-project.herokuapp.com/checkbox";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }


    public boolean datepickerVerification(){
        dropdownMenuButton.click();
        datepicker.click();
        String urlExpected = "https://formy-project.herokuapp.com/datepicker";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean dragAndDropVerification(){
        dropdownMenuButton.click();
        dragAndDrop.click();
        String urlExpected = "https://formy-project.herokuapp.com/dragdrop";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean dropdownVerification(){
        dropdownMenuButton.click();
        dropDown.click();
        String urlExpected = "https://formy-project.herokuapp.com/dropdown";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean enableAndDisableVerification(){
        dropdownMenuButton.click();
        enabledAndDisabled.click();
        String urlExpected = "https://formy-project.herokuapp.com/enabled";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean fileUploadVerification(){
        dropdownMenuButton.click();
        fileUpload.click();
        String urlExpected = "https://formy-project.herokuapp.com/fileupload";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean fileDownloadVerification(){
        dropdownMenuButton.click();
        fileDownload.click();
        String urlExpected = "https://formy-project.herokuapp.com/filedownload";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean keyAndMouseVerification(){
        dropdownMenuButton.click();
        keyAndMouse.click();
        String urlExpected = "https://formy-project.herokuapp.com/keypress";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean modalVerification(){
        dropdownMenuButton.click();
        modal.click();
        String urlExpected = "https://formy-project.herokuapp.com/modal";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean pageScrollVerification(){
        dropdownMenuButton.click();
        pageScroll.click();
        String urlExpected = "https://formy-project.herokuapp.com/scroll";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean radioButtonVerification(){
        dropdownMenuButton.click();
        radioButton.click();
        String urlExpected = "https://formy-project.herokuapp.com/radiobutton";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean switchWindowVerification(){
        dropdownMenuButton.click();
        switchWindow.click();
        String urlExpected = "https://formy-project.herokuapp.com/switch-window";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }

    public boolean completeWebFormVerification(){
        dropdownMenuButton.click();
        completeWebForm.click();
        String urlExpected = "https://formy-project.herokuapp.com/form";
        String urlActual = driver.getCurrentUrl();
        return urlExpected.equals(urlActual);
    }
}
