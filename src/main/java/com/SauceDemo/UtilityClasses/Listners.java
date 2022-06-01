package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.SauceDemo.TestClasses.*;

public class Listners implements ITestListener
{
	WebDriver driver;
	public void onTestSucess(ITestResult result)
	{
		System.out.println("Test case is sucessfully passed");
	}
	public void onTestFailure(ITestResult result)
	{
		   System.out.println("Test case is failed and hence taking the screenshot");
		   Date d=new Date();
			DateFormat d1=new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
			String date=d1.format(d);

            this.driver = ((TestBaseClass)result.getInstance()).driver;
		   
		   TakesScreenshot ts = (TakesScreenshot)driver;
		   File sourceFile =	ts.getScreenshotAs(OutputType.FILE);	
		   File destFile = new File("./screenshots/SauceDemoLogin3105"+date+".jpg");	
		   try 
		   {
			FileHandler.copy(sourceFile, destFile);
		    } 
		   catch (IOException e) 
		   {
			e.printStackTrace();
		   }
	}


}
