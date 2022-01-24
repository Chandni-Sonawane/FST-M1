package CRMProject_Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Activity1 {
	WebDriver driver;
	String title;
	
	@BeforeClass
	public void UrlDetails() {
	
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test
	public void getTitle() {
		
		title=driver.getTitle();
		System.out.println("Title is:"+ title);
		Assert.assertEquals("SuiteCRM", title);
		
		
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		driver.close();
		
	}
	

}

