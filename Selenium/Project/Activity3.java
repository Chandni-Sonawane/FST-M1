package CRMProject_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;
	WebElement firstCopyRightText;
	
	@BeforeClass
	public void urlDetails() {
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test
	public void getCopyRightText() {
		firstCopyRightText= driver.findElement(By.xpath("//a[@id='admin_options']"));
		System.out.println("firstCopyRightText is: " +firstCopyRightText.getText());
	
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	

}
