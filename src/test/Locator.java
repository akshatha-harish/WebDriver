package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/akshathaharisht/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver","/home/akshathaharisht/Downloads/geckodriver");
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/" );



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        WebElement linkLogin = driver.findElement(By.xpath("//a[@class='Login']"));
        
        
        linkLogin.click();
        WebElement username = driver.findElement(By.xpath("//input[@class='user_Login']"));
        
        username.sendKeys("abc@xyz.com");
	}
}
		
		
		
		
	
