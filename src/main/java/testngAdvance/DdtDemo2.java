package testngAdvance;

import org.testng.annotations.Test;
import testngAdvance.DataProviders;

public class DdtDemo2 {
    @Test(dataProvider = "Login",dataProviderClass= DataProviders.class)
    public void testDD(String username, String password)
    {
        System.out.println("Username is " + username);
        System.out.println(" Password is " + password);

    }
}
