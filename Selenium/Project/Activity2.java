package CRMProject_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
	
	WebDriver driver;
	WebElement urlOfHeaderImages;
	
	@BeforeClass
	public void urlDetails() {
		
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
	}
	
	@Test
	public void urlOfHeaderImage() {
		urlOfHeaderImages= driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
		System.out.println("url of headerImage is:" +urlOfHeaderImages.getAttribute("src"));
		
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
