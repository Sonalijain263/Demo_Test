package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

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
	  	
	//	System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
//		 driver = new RemoteWebDriver(new URL("http://139.59.77.9:8080/"),new ChromeOptions()); 
 //	    ChromeOptions options= new ChromeOptions();
// 	    options.addArguments("--no-sandbox");
			ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized"); // open Browser in maximized mode
	options.addArguments("disable-infobars"); // disabling infobars
	options.addArguments("--disable-extensions"); // disabling extensions
	options.addArguments("--disable-gpu"); // applicable to windows os only
	options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	options.addArguments("--no-sandbox"); // Bypass OS security model
	driver = new ChromeDriver(options);
	//	driver= new ChromeDriver();    
	driver.get("https://www.pionglobal.com/");
	       
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
	         
	         System.out.println("Title of the page is: " + driver.getTitle());
	         Assert.assertTrue(driver.getTitle().equals("PION Global"));
	            
		}
}
