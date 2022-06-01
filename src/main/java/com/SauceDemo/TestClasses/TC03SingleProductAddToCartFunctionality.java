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

public class TC03SingleProductAddToCartFunctionality extends TestBaseClass
{

	
	@Test
	public void checkSingleProductAddToCart()
	{
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		
		hp.clickAddToCart();
		log.info("add to cart button is clicked");
		String actualText=hp.getTextFromCartButton();
		String expectedText="1";
		
		Assert.assertEquals(actualText, expectedText);
		
		
		
		// to log out
		hp.clickMenuButton();
		log.info("click me button is clicked");
		
		hp.clickLogOutButton();
		log.info("log out button is clicked");
	}
	
}
