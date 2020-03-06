package CucumberFiles.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ReceiptPage;
import webDriverSettings.WebDriverSettings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Steps extends WebDriverSettings {
    ReceiptPage receiptPage;

    @Given("^I am visiting LinkedIn$")
    public void iAmVisitingMyAccountOnLinkedIn() {
        driver.get("https://www.linkedin.com/");
    }

    @When("^I am putting all my correct credentials$")
    public void iAmPuttingAllMyCorrectCredentials() throws InterruptedException {
        LinkedInPage linkedInPage = new LinkedInPage(driver);
        assertTrue(linkedInPage.isInitialized());

        linkedInPage.enterCredentials("rixej68166@emailnube.com", "testtest");

        receiptPage = linkedInPage.submit();
        assertTrue(receiptPage.isInitialized());
        Thread.sleep(2000);

    }

    @Then("^I successfully logged in$")
    public void iSuccessfullyLoggedIn() {
        assertEquals("Thanks for submitting your form", receiptPage.confirmationHeader());
    }
}