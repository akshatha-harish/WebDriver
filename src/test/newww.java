package test;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class LoginTest {
    
    public static void main(String[] args) {
        
            System.setProperty("webdriver.chrome.driver","/home/amalshajutecnot/Downloads/chromedriver");

 

            WebDriver driver = new ChromeDriver();
             
            driver.get("https://simplilearn.com/" );

 

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
            
            WebElement linkLogin = driver.findElement(By.linkText("Log in"));
            
            linkLogin.click();
            WebElement editUsername =driver.findElement(By.name("user_login"));
            editUsername.sendKeys("abc@cys.com");
            WebElement editpwd = driver.findElement(By.name("user_pwd"));
            
//            editpwd.sendKeys("123");
//            WebElement chkBox =driver.findElement(By.className("rememberMe"));
//            chkBox.click();
//            WebElement btnPwd = driver.findElement(By.name("btn_login"));
//            btnPwd.click();
//            
            
            
            
            driver.quit();
    }
}