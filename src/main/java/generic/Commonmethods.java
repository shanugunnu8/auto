package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yo.qa.base.TestBase;

public class Commonmethods  extends TestBase
{
public static void sendkeyss( WebElement element, String Text) {
	
		element.sendKeys(Text);
	}
	
	public static void onclick(WebElement element) {

		element.click();
	}
	public static void  select(WebElement element,int index) {
			
		Select Sselect = new Select(element);
		Sselect.selectByIndex(index);
	/*WebElement selecting = driver.findElement(By.xpath(locator));
		List<WebElement> options = selecting.findElements(By.xpath(Locator2));
		  String str1="Hindi";
		  String str2= "English";
		  for(WebElement we1 : lang)
		  {
			  
			  if(we1.equals(str1)|| we1.equals(str2))
			  {
				  we1.click();
			  }
		  }*/
		
				
	}
	public static void multiselect(WebDriver driver, WebElement element1	,String locator) {
		element1.click();
		  List<WebElement> lang = driver.findElements(By.xpath(locator));
		  String str1="Hindi";
		  String str2= "English";
		  for(WebElement we1 : lang)
		  {
			  
			  if(we1.equals(str1)|| we1.equals(str2))
			  {
				  we1.click();
			  }
		  }
		  
		  
	}
	
	public static void selection(WebElement element1,WebElement element2,String Text) 
	{
		element1.click();
		element2.sendKeys(Text);
	}
	
	public static void succes(WebDriver driver ,String title)
	{
	 String url = driver.getTitle();	
	 System.out.println(url);
	 if(url.contains(title))
	 {
		 System.out.println("registration successful");
	 }
	 else
	 {
		 System.out.println("not so succesful");
	 }
	}
	 public static void  switchTo(WebDriver driver)
	 {
	driver.switchTo().alert().accept();	
	}
	 public static void  switchToText(WebDriver driver, String Text)
	 {
	driver.switchTo().alert().sendKeys(Text);	
	driver.switchTo().alert().accept();	
	}
		
	
}
