import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @Test(dataProvider = "AuthenticationHappy", dataProviderClass = DataProviderForEmailsChecking.class)
    public void emailCheck(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult,"Happy path test failed");
    }
}
