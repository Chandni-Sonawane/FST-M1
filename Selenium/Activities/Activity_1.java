package TestNG_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_1 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}
	
	
	@Test
	public void getTitle() {
		
		String title=driver.getTitle();
		System.out.println("Title is:"+title);
		
		WebElement pageTitle=driver.findElement(By.xpath("//h1"));
		Assert.assertEquals("Training Support", title);
		
		driver.findElement(By.cssSelector("a#about-link")).click();
		
		String title2=driver.getTitle();
		System.out.println("Title is:"+title2);
		
		Assert.assertEquals("About Training Support", title2);
		
		
}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	
	
	

}
