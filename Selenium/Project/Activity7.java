package CRMProject_Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement loginButton;
	WebElement sales;
	Actions action;
	WebElement leads;
	
	
	@BeforeClass
	public void urlDetails() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get("http://alchemy.hguy.co/crm");
		action=new Actions(driver);
		
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
	public void getsalesTab() throws InterruptedException {
	
		
		 sales=driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]"));
		 action.moveToElement(sales).build().perform();
		 leads=driver.findElement(By.xpath("//a[@href='?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DLeads%26action%3Dindex%26parentTab%3DSales']"));
		 leads.click();
		 WebDriverWait wait=new WebDriverWait(driver,10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='adspan_20b3f9c1-6c63-8d08-7bfb-5f5a33457752']")));
		 element.click();
		
	    WebElement phone= driver.findElement(By.cssSelector("span.phone"));
	    System.out.println("phone is:" +phone.getText());
	    Assert.assertNotEquals(123456, phone, "true");
	}    
		
	    @AfterClass
		public void close() {
			driver.close();
		}
	
	
		 
	

}
