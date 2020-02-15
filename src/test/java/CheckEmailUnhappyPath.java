import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @Test(dataProvider = "AuthenticationUnhappy", dataProviderClass = DataProviderForEmailsChecking.class)
    public void emailCheck(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult);
    }
}
