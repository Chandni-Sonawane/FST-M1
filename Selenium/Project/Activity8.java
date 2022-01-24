package CRMProject_Activities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
	
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement loginButton;
	WebElement sales;
	Actions action;
	WebElement accountButton;
	//WebElement oddRows;
	
	
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
public void getAccountsPage() {
	sales=driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]"));
	 action.moveToElement(sales).build().perform();
	 
	 accountButton=driver.findElement(By.xpath("//a[@href='?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DAccounts%26action%3Dindex%26parentTab%3DSales']"));
	 accountButton.click();
	 
	 List<WebElement> oddRows=driver.findElements(By.xpath("//table[@class='list view table-responsive']//tbody//tr[position() mod 2 = 1]"));
	
	 WebDriverWait w1=new WebDriverWait(driver,10);
	 w1.until(ExpectedConditions.visibilityOfAllElements(oddRows));
	 WebElement details;
	 for(int i=1;i<=5;i++) {
		 details=oddRows.get(i);
	 System.out.println("oddRows is: "+details.getText());
}
	 }
@AfterClass
	public void close() {
		driver.close();
	}

}
