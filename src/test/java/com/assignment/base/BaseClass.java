package com.assignment.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	//to create object of prop file into program
	 static Properties prop = new Properties(); 
	 static {
            try {
		              FileInputStream inpstm = new FileInputStream("C:\\Users\\ritiknirwan\\Downloads\\AutomationFlipkart\\AutomationFlipkart\\configuration\\config.properties");
					 prop.load(inpstm); //to import & load the prop file
		     }
            catch(Exception e) {
          	  	e.printStackTrace(); } 
}
	 
	 
         public static WebDriver driver;
	      
	      
		@BeforeTest
	      @Parameters("BrowserName")
	       //method to start WebDriver
		   public static void initializeWebdriver(String BrowserName) throws Exception
		   {
			// Set the path for chromeDriver
	    	  if(BrowserName.equalsIgnoreCase("chrome"))
	    	  {
	    		  System.setProperty("webdriver.chrome.driver",prop.getProperty("pathofChromeDriver"));
//	  			ChromeOptions options = new ChromeOptions();
//	  			options.addArguments("window-size=1400,800");
//	  			options.addArguments("headless");
	  			driver= new ChromeDriver();
	  		}
	    	  
	    	  else{
	              //If no browser passed throw exception
	              throw new Exception("Browser is not correct");
	             }
	    	driver.get(prop.getProperty("url"));	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   }
	      
	

	
	      @AfterTest
			//closing web browser
			public static void closeBrowser()
			{
	    	  driver.quit();
		   }
		



}
