import org.testng.annotations.DataProvider;

public final class DataProviderForEmailsChecking {
    @DataProvider(name = "AuthenticationHappy")
    public static Object[] credentialsHappy() {
        return new Object[]{
                "!!ii123iiiiASDii__ii@ukr.net",
                "_!1@ukr.net",
                "testuser@1ZaZ1.net",
                "testuser@aZ.net",
                "testuser@urk.aawer",
                "testuser@urk.zz"};
    }

    @DataProvider(name = "AuthenticationUnhappy")
    public static Object[] credentialsUnhappy() {
        return new Object[]{
                "Za11фЯ#$%1^&*()-+/~Іі@ukr.net",
                "__@ukr.net",
                "ttt@$.net",
                "ttt@u1ГZ!_.net",
                "ttt@aaa.!",
                "ttt@aaa.aSі%1#)"};
    }
}
