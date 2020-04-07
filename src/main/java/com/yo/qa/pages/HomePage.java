package com.yo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yo.qa.base.TestBase;

import generic.DLocators;



public class HomePage extends TestBase implements DLocators{
	
	@FindBy(xpath=skipSignIn)
	WebElement sikpsignin;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateHomePageTitle()
	{
		return  driver.getTitle();
	}
	public Registration SkipSignIn()
	{
		sikpsignin.click();
		return new Registration();
	}
	public String homePageTitle() 
	{
		return driver.getTitle();
		
	}

}
