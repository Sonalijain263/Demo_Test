package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GridTest {
	public WebDriver driver;
	
	   @Test
		public void setup() throws MalformedURLException
		{
		 //Define desired capabilities
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.LINUX);
			
			//Chrome option  
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			options.setHeadless(true);
			
			
			//Hub URL
			String huburl ="http://139.59.77.9:4444/wd/hub";
			 
			// Create driver with hub address and capability
			WebDriver driver=new RemoteWebDriver(new URL(huburl), options);
			
	
			driver.get("https://www.pionglobal.com/");
	       
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
	         
	         System.out.println("Title of the page is: " + driver.getTitle());
	         Assert.assertTrue(driver.getTitle().equals("PION Global"));
	         
	         driver.close();
	            
		}
}
