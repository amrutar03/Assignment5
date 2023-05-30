package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver =new ChromeDriver(opt);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	    String url= driver.getCurrentUrl();
	    System.out.println("URL IS:::"+url);
		   if(url.endsWith("login"))
		   {
			   System.out.println("Url is ends with login "+url);
		   }
		   else {
			   System.out.println("URL is Not Match");
		   }

		   System.out.println("URL IS:::"+url);
		   if(url.contains("demo"))
		   {
			   System.out.println("Url contains is match:"+url);
		   }
		   else {
			   System.out.println("URL is contains doesNot Match");
		   }
	    String same=driver.getTitle();
	    System.out.println("Title is:::"+same);
		   
		   if(same.contains("HRM"))
		   {
			   System.out.println("Title contains is "+same);
		   }
		   else {
			   System.out.println("Title contains not match");
		   }
		   driver.quit();
	}

}
