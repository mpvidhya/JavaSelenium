package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    //since driver is not used then null pointer exception - so use constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By username=By.name("username");
    By password=By.name("password");
    By loginButton=By.xpath("//button[@type='submit']");
    public void typeUsername(String uname)
    {
        driver.findElement(username).sendKeys(uname);
    }

    public void typePassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin()
    {
        driver.findElement(loginButton).click();
    }
    public String loginApplication(String uname,String pass)
    {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();

        return driver.getCurrentUrl();
    }

    public Logout loginApplicationNew(String uname,String pass)
    {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
        Logout logout= PageFactory.initElements(driver,Logout.class);
        return logout;
    }
}
