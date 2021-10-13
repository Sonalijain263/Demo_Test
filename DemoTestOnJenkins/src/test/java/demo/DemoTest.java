package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoTest {
	
	public WebDriver driver;
	
	   @Test
		public void setup()
		{
	  	
		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
	//	 ChromeOptions options = new ChromeOptions();
	 //      options.addArguments("headless");
	  //     options.addArguments("disable-gpu");	
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		 driver = new RemoteWebDriver(new URL("http://139.59.77.9:8080/"), capability);
	//	driver = new ChromeDriver(options);
	 
	         driver.get("https://www.pionglobal.com/");
	       
	         driver.manage().window().maximize();
	         
	         System.out.println("Title of the page is: " + driver.getTitle());
	         Assert.assertTrue(driver.getTitle().equals("PION Global"));
	            
		}
}
