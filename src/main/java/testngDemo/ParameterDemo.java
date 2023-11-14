package testngDemo;

import org.testng.SuiteRunner;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
    @Parameters({"username","password"})
//    @Test
//    public void test1(String param1, String param2)
//    {
//        System.out.println((param1));
//        System.out.println((param2));
//
//    }
    //optional passing
    @Test
    public void test2(@Optional("mukesh") String param1, @Optional("test") String param2)
    {
        System.out.println((param1));
        System.out.println((param2));

    }
}
