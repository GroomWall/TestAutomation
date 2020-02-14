import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @DataProvider(name = "Authentication")
    public static Object[] credentials() {
        return new Object[] {"ottffssentettffssentt@ukr.net", "tt@ukr.net" , "@#$%^&*()-+/~@ukr.net",
                "ttt@u.net", "ttt@uuuuuu.net", "ttt@+#$%.net", "ttt@aaa.n",
                "ttt@aaa.nnnnnn", "ttt@aaa.@#$%"};
    }

    @Test(dataProvider = "Authentication")
    public void emailCheck(String email){
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult);
    }
}
