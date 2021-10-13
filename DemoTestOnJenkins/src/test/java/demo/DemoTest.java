package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	public WebDriver driver;
	
	   @Test
		public void setup() throws MalformedURLException
		{
	  	
		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:9515"),new ChromeOptions()); 
	         driver.get("https://www.pionglobal.com/");
	       
	         driver.manage().window().maximize();
	         
	         System.out.println("Title of the page is: " + driver.getTitle());
	         Assert.assertTrue(driver.getTitle().equals("PION Global"));
	            
		}
}
