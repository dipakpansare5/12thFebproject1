package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass
{

	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickMenuButton()
	{
		menuButton.click();
	}

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutButton;
	
	public void clickLogOutButton()
	{
		logoutButton.click();
	}
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	// single element added to cart
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addToCart;
	
	public void clickAddToCart()
	{
		addToCart.click();
	}
	
	// cart button find text get
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement cartButton;
	
	public String getTextFromCartButton()
	{
		String text=cartButton.getText();
		return text;
	}
	
	//multiple product added to cart
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multipleProduct;
	
	public void clickMultipleProducts()
	{
		for(int i=0; i<multipleProduct.size();i++)
		{
		 multipleProduct.get(i).click();
		}
	
	}
	
	
}
