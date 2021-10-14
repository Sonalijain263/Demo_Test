package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DemoTest {
	
	public WebDriver driver;
	
	   @Test
		public void setup() throws MalformedURLException
		{
//		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
//		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
//		driver = new RemoteWebDriver(new URL("http://139.59.77.9:4444/"),new ChromeOptions()); 
//	    ChromeOptions options= new ChromeOptions();
// 	    options.addArguments("headless");
//		driver= new ChromeDriver(options);  
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://139.59.77.9:4444/"), capability);
		ChromeOptions options= new ChromeOptions();
 	        options.addArguments("headless");
		driver= new ChromeDriver(options);
		driver.get("https://www.pionglobal.com/");
	       
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
	         
	         System.out.println("Title of the page is: " + driver.getTitle());
	         Assert.assertTrue(driver.getTitle().equals("PION Global"));
	            
		}
}
