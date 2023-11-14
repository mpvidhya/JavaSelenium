//package org.example;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.Optional;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CrossBrowserTesting {
//
//    @Parameters({"URL","Browser","Username","Password"})
//    @Test
//    public void runLoginTest(@Optional("https://opensource-demo.orangehrmlive.com/")String url,@Optional("Chrome")String browser,@Optional("admin")String username,@Optional("admin123")String password)
//    {
//
//        System.out.println("Thread id is "+Thread.currentThread().getId());
//        System.out.println("Thread name is "+Thread.currentThread().getName());
//
//        WebDriver driver=null;
//
//       // driver.manage().deleteAllCookies();
//
//        if(browser.equalsIgnoreCase("Chrome"))
//        {
//            WebDriverManager.chromedriver().setup();
//            driver=new ChromeDriver();
//        }
//        else if(browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("FF"))
//        {
//            try
//            {
//                WebDriverManager.firefoxdriver().setup();
//            } catch (Error e)
//            {
//                System.out.println("Failed to download driver automatically "+e.getMessage());
//                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/driver/geckodriver.exe");
////            }
//            driver=new FirefoxDriver();
//        }
//        else if(browser.equalsIgnoreCase("Edge")) {
//            WebDriverManager.edgedriver().setup();
//            driver=new EdgeDriver();
////        }
//        else
//        {
//            System.out.println("Sorry -Only Chrome,FF, Edge is supported for execution");
//        }
//        driver.manage().window().maximize();
//        driver.get(url);
//      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//      //  driver.findElement(By.id("txtUsername")).sendKeys(username);
//        driver.findElement(By.id("txtPassword")).sendKeys(password);
//        driver.findElement(By.id("btnLogin")).click();
//        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login failed");
//        driver.quit();
//    }
//
//}