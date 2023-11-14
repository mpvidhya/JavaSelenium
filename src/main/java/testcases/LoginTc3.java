package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Logout;

import java.time.Duration;


public class LoginTc3 {

    @Test
    public void loginWithAdmin()
    {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        LoginPage login=PageFactory.initElements(driver, LoginPage.class);

        String url=login.loginApplication("Admin", "admin123");

        Assert.assertTrue(url.contains("dashboard"));

        Logout logout=PageFactory.initElements(driver, Logout.class);

        String urlAfterLogout=logout.logoutFromApplication();

        Assert.assertTrue(urlAfterLogout.contains("login"));

    }
}



