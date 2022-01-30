import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		System.out.println("Tiitle is:"+driver.getTitle());
		
		WebElement username=driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
		WebElement password=driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
		
		WebElement confirmPasswrod=driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		
		username.sendKeys("ffff");
		password.sendKeys("pass");
		confirmPasswrod.sendKeys("pass");
		email.sendKeys("abs@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		
		String msg=driver.findElement(By.cssSelector("div#action-confirmation")).getText();
		System.out.println("msg is:"+msg);
		driver.close();
		
		
		
		
	}

}
