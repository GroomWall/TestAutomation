import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider(name = "Authentication")
    public static Object[] credentials() {
        return new Object[] {"testuser@ukr.net", "TESTUSER@ukr.net", "123456789022@ukr.net",
                "!!!@ukr.net", "___@ukr.net",
                "testuser@11111.net", "testuser@aaaaa.net", "testuser@ZZZZZ.net", "testuser@urk.aaaaa",
                "testuser@urk.aa", "___@111.aaa"};
    }

    @Test(dataProvider = "Authentication")
    public void emailCheck(String email){
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult);
    }
}
