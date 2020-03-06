package hw2WithPageObjects.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.PageObject;

public class CheckboxPage extends PageObject {
    @FindBy(id="checkbox-1")
    private WebElement checkbox1;
    @FindBy(id="checkbox-2")
    private WebElement checkbox2;
    @FindBy(id="checkbox-3")
    private WebElement checkbox3;

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return checkbox1.isDisplayed();
    }

    public void checkbox1(){
        checkbox1.click();
    }

    public void checkbox2(){
        checkbox2.click();
    }

    public void checkbox3(){
        checkbox3.click();
    }
}
