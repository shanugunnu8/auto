package com.yo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yo.qa.base.TestBase;

import generic.Commonmethods;
import generic.DLocators;

public class Registration extends TestBase implements DLocators {

	@FindBy(xpath=firstName)
	 WebElement firstname;
	
	@FindBy(xpath=LastName)
	WebElement lastname;
	
	@FindBy(xpath=Address)
	WebElement address;
	
	@FindBy(xpath=Email)
	WebElement email;
	
	@FindBy(xpath=Phone)
	WebElement phone;
	
	@FindBy(xpath=Gender)
	WebElement gender;
	
	@FindBy(xpath=Language)
	WebElement language;
	
	@FindBy(xpath=Lang)
	WebElement lang;
	
	@FindBy(xpath=Hobbies)
	WebElement hobbies;
	
	@FindBy(xpath=Skills)
	WebElement skills;
	
	@FindBy(xpath=Country)
	WebElement country;
	
	@FindBy(xpath=Country2)
	WebElement country2;
	
	@FindBy(xpath=CountrySearch)
	WebElement countrysearch;
	
	@FindBy(xpath=Year)
	WebElement year;
	
	@FindBy(xpath=Month)
	WebElement month;
	
	@FindBy(xpath=Day)
	WebElement day;
	
	@FindBy(xpath=Password)
	WebElement password;
	
	@FindBy(xpath=ConfirmPassword)
	WebElement confirmPassword;
	
	@FindBy(xpath=Submit)
	WebElement submit;
	@FindBy(xpath=Refresh)
	WebElement refresh;
	
	public Registration()
	{
		
	PageFactory.initElements(driver, this);
	}
		
	
	public WebTable registrationMethod()
	{
		Commonmethods.sendkeyss( firstname	, "ana");
		Commonmethods.sendkeyss( lastname, "pareek");
		Commonmethods.sendkeyss(address, "bhopal");
		Commonmethods.sendkeyss(email	, "asd@gmail.com");
		Commonmethods.sendkeyss(phone	, "1234567896");
		Commonmethods.onclick(gender);
		Commonmethods.onclick(hobbies);
		Commonmethods.multiselect(driver, language, Lang);
		Commonmethods.select(skills, 3);
		Commonmethods.select(country, 5);
		Commonmethods.selection	( country2, countrysearch, "Australia");
		Commonmethods.select( year, 5);
		Commonmethods.select( month, 5);
		Commonmethods.select(day, 6);
		Commonmethods.sendkeyss( password, "Anamika1");
		Commonmethods.sendkeyss(confirmPassword, "Anamika1");
		Commonmethods.onclick(submit);
		return new WebTable();
		
	}
	public void  refreshmethod()
	{
		Commonmethods.sendkeyss( firstname	, "ana");
		Commonmethods.sendkeyss( lastname, "pareek");
		Commonmethods.sendkeyss(address, "bhopal");
		Commonmethods.sendkeyss(email	, "asd@gmail.com");
		Commonmethods.sendkeyss(phone	, "1234567896");
		Commonmethods.onclick(refresh);
	}
	public String registrationPageTitle() 
	{
		return driver.getTitle();
		
	}
}
