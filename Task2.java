package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Task2 {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver =new ChromeDriver(opt);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	    
//	 boolean ele=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
//	 Assert.assertTrue(ele, "Logo is present");
	 
	 WebElement ele=driver.findElement(By.xpath("//img[@alt='company-branding']"));
	 Boolean islogoDisplayed=ele.isDisplayed();
	 
	 if(islogoDisplayed)
	 {
		 System.out.println("Logo is displayed");
	 }
	 else
	 {
		 System.out.println("Logo is NOT displayed");
	 }
    driver.quit();
	}

}
