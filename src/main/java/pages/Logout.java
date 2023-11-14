package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

    WebDriver driver;

    public Logout(WebDriver driver)
    {
        this.driver=driver;
    }

    By welcome=By.xpath("//span[@class='oxd-userdropdown-tab']");

    By logoutLink=By.xpath("//a[contains(text(),'Logout')]");

    public String logoutFromApplication()
    {
        driver.findElement(welcome).click();
        driver.findElement(logoutLink).click();
        return driver.getCurrentUrl();
    }

}