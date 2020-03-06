package hw2WithPageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.PageObject;

public class ButtonsPage extends PageObject {
    @FindBy(xpath = "//button[contains(text(),'Primary')]")
    private WebElement primary;
    @FindBy(xpath = "//button[contains(text(),'Success')]")
    private WebElement success;
    @FindBy(xpath = "//button[contains(text(),'Info')]")
    private WebElement info;
    @FindBy(xpath = "//button[contains(text(),'Warning')]")
    private WebElement warning;
    @FindBy(xpath = "//button[contains(text(),'Danger')]")
    private WebElement danger;
    @FindBy(xpath = "//button[contains(text(),'Link')]")
    private WebElement link;
    @FindBy(xpath = "//button[contains(text(),'Left')]")
    private WebElement left;
    @FindBy(xpath = "//button[contains(text(),'Middle')]")
    private WebElement middle;
    @FindBy(xpath = "//button[contains(text(),'Right')]")
    private WebElement right;
    @FindBy(xpath = "//button[contains(text(),'1')]")
    private WebElement button1;
    @FindBy(xpath = "//button[contains(text(),'2')]")
    private WebElement button2;
    @FindBy(xpath = "//*[@id='btnGroupDrop1']")
    private WebElement dropdownButton;
    @FindBy(xpath = "//a[contains(text(),'Dropdown link 1')]")
    private WebElement dropdownLink1;
    @FindBy(xpath = "//a[contains(text(),'Dropdown link 2')]")
    private WebElement dropdownLink2;

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return primary.isDisplayed();
    }

    public void primary() {
        primary.click();
    }

    public void success() {
        success.click();
    }

    public void info() {
        info.click();
    }

    public void warning() {
        warning.click();
    }

    public void danger() {
        danger.click();
    }

    public void link() {
        link.click();
    }

    public void left() {
        left.click();
    }

    public void middle() {
        middle.click();
    }

    public void right() {
        right.click();
    }

    public void press1() {
        button1.click();
    }

    public void press2() {
        button2.click();
    }

    public void dropdownLink1() {
        dropdownButton.click();
        dropdownLink1.click();
    }

    public void dropdownLink2() {
        dropdownButton.click();
        dropdownLink2.click();
    }
}
