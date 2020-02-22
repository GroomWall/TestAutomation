import org.testng.Assert;
import org.testng.annotations.Test;
import webDriverSettings.WebDriverSettings;

import java.util.Collections;

public class CheckAssertions extends WebDriverSettings {

    @Test
    public void matchOfTitleTestHappyPath() {
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Google", driver.getTitle(), "Title not matching");
    }

    @Test
    public void matchOfTitleTestUnhappyPath() {
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Gooooogle", driver.getTitle(), "There is no title with such a name");
    }

    @Test
    public void assertEqualsComparisonTest() {
        String actual = "Hello";
        String expected = "Hi";
        Assert.assertEquals(actual, expected, "There is no match");
    }

    @Test
    public void assertEqualsBooleanComparisonTest() {
        Assert.assertEquals(true, true, "There is no match");
    }

    @Test
    public void assertEqualsCollectionsComparisonTest() {
        Object actual = Collections.EMPTY_LIST;
        Object expected = Collections.EMPTY_LIST;
        Assert.assertEquals(actual, expected, "There is no match");
    }

    @Test
    public void assertTrueImplementationExample() {
        Assert.assertTrue(true, "The entered expression isn't true");
    }

    @Test
    public void assertFalseImplementationExample() {
        Assert.assertFalse(false, "There is no match");
    }
}
