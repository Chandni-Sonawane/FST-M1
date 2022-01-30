import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Title is:"+title);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("chandni");
		
		WebElement lastName= driver.findElement(By.xpath("//input[starts-with(@placeholder,'Last')]"));
		lastName.sendKeys("Sonawane");
		
		WebElement emails = driver.findElement(By.xpath("//input[starts-with(@placeholder,'abc')]"));
		emails.sendKeys("abc@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[starts-with(@pattern,'[0')]"));
		phone.sendKeys("4555555555");
		
		 driver.findElement(By.xpath("//input[starts-with(@value,'submit')]")).click();
		
	
		driver.close();
		
		
		 
		
		
		
		
		
	}

}
