package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC04MultipleProductAddToCartFunctionality extends TestBaseClass
{

	
	@Test
	public void checkMultipleProductAddToCart()
	{
		// home page object
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		
		hp.clickMultipleProducts();
		log.info("multiple products added to cart");

		String actualText=hp.getTextFromCartButton();
		String expextedText="6";
		
		Assert.assertEquals(actualText, expextedText);
		
		// log out 
		hp.clickMenuButton();
		log.info("menu button clicked");
		
		hp.clickLogOutButton();
		log.info("log out button is clicked");
	}
	
	
		
		
		
		
		
		
		
		
		
		


}
