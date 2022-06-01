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

public class TC02LogOutFunctionalityTestClass extends TestBaseClass
{
	
	@Test
	public void chechLogOutFunctionality() throws IOException
	{
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		
		hp.clickMenuButton();
		log.info("menu button is clicked");
		
		ScreenShot.ScreenShot(driver);
		log.info("screen shot is taken");
		
		hp.clickLogOutButton();
		log.info("log out button is clicked");
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Swag Labs";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
	}
	
	
	
	
		
		
		
		
		
		
	}

