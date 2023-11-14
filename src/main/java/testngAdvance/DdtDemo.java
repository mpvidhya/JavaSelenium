package testngAdvance;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DdtDemo {

   @Test(dataProvider = "Login")
   public void testDD(String username, String password)
    {
        System.out.println("Username is " + username);
        System.out.println(" Password is " + password);

    }

    @DataProvider(name="Login")
    public Object[][] generateData()
    {
        Object [][]arr= new Object[2][2];
        arr[0][0]="vidhy1a";
        arr[0][1]="vidh2ya";
        arr[1][0]="vidh3ya";
        arr[1][1]="vidh4ya";
        return arr;


    }
}
