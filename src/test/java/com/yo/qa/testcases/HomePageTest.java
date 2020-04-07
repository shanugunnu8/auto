package com.yo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.yo.qa.base.TestBase;
import com.yo.qa.pages.HomePage;

import com.yo.qa.pages.Registration;

import generic.DLocators;
import generic.ListnerBlog;
@Listeners(ListnerBlog.class)
public class HomePageTest extends TestBase implements DLocators 
{
	HomePage homepage;
	Registration register;
	  public HomePageTest()
	  {
		
		  super();
	  }
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		
		 homepage = new HomePage();
		 
	}
	@Test
	public void skipSighInTest()
	{
		
		register = homepage.SkipSignIn();
	}
	@Test
	public void HomepageTitleTest()
	{
		String title = homepage.homePageTitle();
		Assert.assertEquals(title, "Index");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
