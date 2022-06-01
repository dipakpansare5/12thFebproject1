package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenShot;



public class TC01LoginFunctionalityTestClass extends TestBaseClass
{

	// test method call
	@Test
	public void chechLoginFunctionality() throws IOException, InterruptedException
	{
		// screen shot
		ScreenShot.ScreenShot(driver);
		log.info("screen shot taken");
		
		String expectedTitle=" Labs";
		String actualTitle=driver.getTitle();
		
	Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		// to log out
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickMenuButton();
		log.info("menu button is clicked");
		
		hp.clickLogOutButton();
		log.info("logout button is clicked");
	}
	

		
	}

