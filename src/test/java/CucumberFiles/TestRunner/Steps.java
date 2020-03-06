package CucumberFiles.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.ReceiptPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Steps {
    ReceiptPage receiptPage;
    WebDriver driver;

    @Given("^I am visiting LinkedIn$")
    public void iAmVisitingMyAccountOnLinkedIn() {
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
    }

    @When("^I am putting all my correct credentials$")
    public void iAmPuttingAllMyCorrectCredentials() throws InterruptedException {
        LinkedInPage linkedInPage = new LinkedInPage(driver);
        Thread.sleep(2000);
        linkedInPage.enterCredentials("rixej68166@emailnube.com", "еуыееуые");

        receiptPage = linkedInPage.submit();
        assertTrue(receiptPage.isInitialized());
        Thread.sleep(3000);
    }

    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() {
        assertEquals("Feed Updates", receiptPage.confirmationHeader());
        driver.close();
    }
}