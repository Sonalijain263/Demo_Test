package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	public WebDriver driver;
	
	   @Test
		public void setup()
		{
	  	
		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
		 ChromeOptions options = new ChromeOptions();
	       options.addArguments("headless");
	       options.addArguments("disable-gpu");	
		driver = new ChromeDriver(options);
	 
	         driver.get("https://www.pionglobal.com/");
	       
	         driver.manage().window().maximize();
	         
	         System.out.println("Title of the page is: " + driver.getTitle());
	         Assert.assertTrue(driver.getTitle().equals("PION Global"));
	            
		}
}
