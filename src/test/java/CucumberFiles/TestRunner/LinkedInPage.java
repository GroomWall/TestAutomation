package CucumberFiles.TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.PageObject;
import pageObject.ReceiptPage;

public class LinkedInPage extends PageObject {
    @FindBy(xpath = "//input[@name='session_key']")
    private WebElement emailOrPhone;
    @FindBy(xpath = "//input[@name='session_password']")
    private WebElement password;
    @FindBy(xpath = "//button[@class='sign-in-form__submit-btn']")
    private WebElement logInButton;

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return emailOrPhone.isDisplayed() && logInButton.isDisplayed() && password.isDisplayed();
    }

    public void enterCredentials(String emailOrPhone, String password) {
        this.emailOrPhone.clear();
        this.emailOrPhone.sendKeys(emailOrPhone);

        this.password.clear();
        this.password.sendKeys(password);
    }

    public ReceiptPage submit() {
        logInButton.click();
        return new ReceiptPage(driver);
    }
}
