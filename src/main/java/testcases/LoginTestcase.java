package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.time.Duration;


public class LoginTestcase {
    @Test

    public void loginwithAdmin() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        LoginPage login=new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        login.typeUsername("Admin");

        login.typePassword("admin123");

        login.clickLogin();

    }
    }

