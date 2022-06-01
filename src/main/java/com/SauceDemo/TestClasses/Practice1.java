package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

public class Practice1
{
	@Test
	public void method1()
	{
		System.out.println("method-1");
	}
	@Test(timeOut=2000)
	public void method2() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("method-1");
	}
	@Test
	public void method3()
	{
		System.out.println("method-3");
	}
	
}
