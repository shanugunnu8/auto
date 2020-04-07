package com.yo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.yo.qa.base.TestBase;
import com.yo.qa.pages.HomePage;
import com.yo.qa.pages.Registration;
import com.yo.qa.pages.WebTable;

import generic.ListnerBlog;
@Listeners(ListnerBlog.class)
public class RegistrationPageTest extends TestBase
{
	Registration register;
	HomePage homepage;
	WebTable webtable;
public RegistrationPageTest () 
{
super();	
}

@BeforeMethod
public void setup()
{
	initialization();
	
	 homepage = new HomePage();
	 register = new Registration();
	 register = homepage.SkipSignIn();
	 
}

@Test(priority = 1)
public void registrationtest()
{
	webtable = register.registrationMethod();
}

@Test(priority = 2)
public void refreshfunction() 
{
	register.refreshmethod();

}

@Test(priority =3)
public void registrationPageTitleTest()
{
	String title = register.registrationPageTitle();
	 Assert.assertEquals(title, "Register");
}

@AfterMethod
public void tearDown()
{
    System.out.println("hello");
	driver.quit();
}
	
}
