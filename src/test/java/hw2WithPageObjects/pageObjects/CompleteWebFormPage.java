package hw2WithPageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.PageObject;
import pageObject.ReceiptPage;

public class CompleteWebFormPage extends PageObject {

    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "job-title")
    private WebElement jobTitle;
    @FindBy(id = "radio-button-1")
    private WebElement radioButton1;
    @FindBy(id = "radio-button-2")
    private WebElement radioButton2;
    @FindBy(id = "radio-button-3")
    private WebElement radioButton3;
    @FindBy(id = "checkbox-1")
    private WebElement checkbox1;
    @FindBy(id = "checkbox-2")
    private WebElement checkbox2;
    @FindBy(id = "checkbox-3")
    private WebElement checkbox3;
    @FindBy(id = "select-menu")
    private WebElement selectMenu;
    @FindBy(xpath = "//a[@href='/thanks']")
    private WebElement submitButton;

    public CompleteWebFormPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return firstName.isDisplayed() && submitButton.isDisplayed();
    }

    public void setRadioButton1() {
        radioButton1.click();
    }

    public void setRadioButton2() {
        radioButton2.click();
    }

    public void setRadioButton3() {
        radioButton3.click();
    }

    public void setCheckbox1() {
        checkbox1.click();
    }

    public void setCheckbox2() {
        checkbox2.click();
    }

    public void setCheckbox3() {
        checkbox3.click();
    }

    public void enterName(String firstName, String lastName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void enterJobTitle(String title) {
        this.jobTitle.clear();
        this.jobTitle.sendKeys(title);
    }

    public ReceiptPage submit() {
        submitButton.click();
        return new ReceiptPage(driver);
    }
}
