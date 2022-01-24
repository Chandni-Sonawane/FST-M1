package CRMProject_Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.*;
public class Activity4 {
	
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement loginButton;
	//WebElement homeLogo;
	//WebDriverWait wait;
	
	@BeforeClass
	public void urlDetails() {
		driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void username() {
		username=driver.findElement(By.xpath("//input[@id='user_name']"));
		username.sendKeys("​admin");
	}
	@Test
	public void password() {
		password= driver.findElement(By.xpath("//input[@id='username_password']"));
		password.sendKeys("​pa$$w0rd");
	}
	@Test
	public void loginButton() throws InterruptedException {
		loginButton=driver.findElement(By.xpath("//input[@id='bigbutton']"));
		loginButton.click();
		//Thread.sleep(2000);
		
		
	}
	@Test
	public void verfiyHomePage() {
		
		
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
		
		System.out.println("currentUrl is: " +url);
	}
	

	@AfterClass
	public void close() {
		driver.close();
	}

}
