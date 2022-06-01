package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;


import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

@Listeners(com.SauceDemo.UtilityClasses.Listners.class)
public class TestBaseClass 
{
	public WebDriver driver;
	Logger log;
	
	// before method call
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("No condition matched");
		}
		log = Logger.getLogger("SauceDemo1");
		 PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL entered");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("selenium wait applied");
	
		driver.manage().window().maximize();
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		
		lp.senduserName();
	    log.info("user name entered");
		
		lp.sendPassword();
		log.info("password is entered");
		
		lp.clickLoginButton();
		log.info("login button clicked");
	}
	
	//to log out 
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	log.info("End of program");

	}

}
