package testngDemo;

import org.testng.annotations.Test;

public class Main {

   // @Test()
   // @Test(description = "This test will perform login")
    @Test(description = "This test",priority = 0)
    public void test1()
    {
        System.out.println("test1 got executed");
    }
    @Test(description = "This is a kkjkjkk")
    public void test2()
    {
        System.out.println("test2 got executed");
    }

}