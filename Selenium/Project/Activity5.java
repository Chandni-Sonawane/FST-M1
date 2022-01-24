package CRMProject_Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement loginButton;
	WebElement navigationMenu;
	
	@BeforeClass
	public void urlDetails() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test(priority=1)
	public void getusername() {
		username=driver.findElement(By.xpath("//input[@id='user_name']"));
		 username.sendKeys("admin");
	}
	@Test(priority=2)
	public void getPassword() {
		password= driver.findElement(By.xpath("//input[@id='username_password']"));
		password.sendKeys("pa$$w0rd");
		
	}
	
	@Test(priority=3)
	public void clickLoginButton() throws InterruptedException {
		loginButton=driver.findElement(By.xpath("//input[@id='bigbutton']"));
		loginButton.click();
		
	}
	
	@Test(priority=4)
	public void getNavigatorBarColor() {
		
		
		navigationMenu=driver.findElement(By.xpath("/html/body/div[2]/nav"));
		
		System.out.println("navigationMenu color is: "+navigationMenu.getCssValue("color"));
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
