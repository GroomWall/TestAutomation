package cucumberFiles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ReceiptPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Steps {
    private ReceiptPage receiptPage;
    private WebDriver driver;

    @Given("^I am visiting LinkedIn$")
    public void iAmVisitingMyAccountOnLinkedIn() {
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
    }

    @When("^I am putting all my correct credentials$")
    public void iAmPuttingAllMyCorrectCredentials() {
        LinkedInPage linkedInPage = new LinkedInPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name = 'session_key']")));
        linkedInPage.enterCredentials("rixej68166@emailnube.com", "еуыееуые");

        receiptPage = linkedInPage.submit();
        assertTrue(receiptPage.isInitialized());
    }

    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() {
        assertEquals("Feed Updates", receiptPage.confirmationHeader());
        driver.quit();
    }
}