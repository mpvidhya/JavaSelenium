package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.Logout;

public class LoginTC5
{

    @Test
    public void loginWithAdmin()
    {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        LoginPage login=PageFactory.initElements(driver, LoginPage.class);

        Logout logout=login.loginApplicationNew("Admin", "admin123");

        logout.logoutFromApplication();
    }

}