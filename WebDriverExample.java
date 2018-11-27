import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;


public class WebDriverExample {
    public static void main(String[] args) {

        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.name("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.name("submitLogin")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("header_employee_box")).click();
        driver.findElement(By.id("header_logout")).click();
driver.close();

    }
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver");
        return  new ChromeDriver();
    }
}









