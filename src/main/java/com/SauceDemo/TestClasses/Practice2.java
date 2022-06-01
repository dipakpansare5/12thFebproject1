
package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Practice2
{
	
	@Test
	public void loginTest()
	{
		//test title
		String actualTitle="Labs";
		String expectedTitle="Swag Labs";
		
		//Hard assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		
		
		// check url
		String actualUrl="www.sauceDemo.com";
		String expectedUrl="www.sauceDemo.com";
		
		soft.assertEquals(actualUrl, expectedUrl);
		soft.assertAll();
	}
//	@Test
//	public void test()
//	{
//		Assert.assertTrue(true);
//	}

}
