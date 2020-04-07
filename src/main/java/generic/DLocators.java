package generic;

public interface DLocators 
{
	String skipSignIn = "//button[@id='btn2']";
	String firstName = "//input[@ng-model='FirstName']";
	String LastName = "//input[@ng-model='LastName']";
	String Address = "//textarea[@ng-model='Adress']";
	String Email = "//input[@ng-model='EmailAdress']";
	String Phone = "//input[@ng-model='Phone']";
	String Gender ="//input[@ng-model='radiovalue' and @value='Male' ]";
	String Language = "//div[@id='msdd']";
	String Lang	= "//ul//li//a[@class='ui-corner-all']";
	String Hobbies ="//input[@value='Movies']";
	String Skills =" //select[@ng-model='Skill']";
	String Country =" //select[@id='countries']";
	String Country2 ="//span[@role='presentation']";
	String CountrySearch ="//input[@role='textbox']";
	String	Year = " //select[@id='yearbox']";
	String	Month = " //select[@ng-model='monthbox']";
	String	Day = " //select[@id='daybox']";
	String	Password = " //input[@id='firstpassword']";
	String	ConfirmPassword = " //input[@id='secondpassword']";
	String  Submit = " //button[@id='submitbtn']";
	String Refresh = "//button[@id='Button1']";
	String ChooseFile = "//input[@id='imagesrc']";
	String switchTo ="(//a[@class='dropdown-toggle'])[1]";
	String alerts = "//a[text()='Alerts']";
	String windows = "//a[text()='Windows']";
	String frames ="//a[text()='Frames']";
	String alertWithOkbtn	= "//button[@class='btn btn-danger']";
	String alertWithOkCancel ="(//a[@class='analystic'])[2]";
	String alertWithOkCancelBtn ="//button[@class='btn btn-primary']";
	String alertWithTextBox ="//a[contains(text(), 'Alert with Textbox ')]";
	String alertWithTextBoxBtn ="//button[@class='btn btn-info']";
	String SingleFrame ="//a[contains(text(), 'Single Iframe')]";

}
