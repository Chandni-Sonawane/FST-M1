import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls ");
		System.out.println("title is:" +driver.getTitle());
		WebElement checkbox= driver.findElement(By.cssSelector("input.willDisappear"));
		System.out.println("checkbox value:"+checkbox.isDisplayed());
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button#toggleCheckbox")).click();
		Thread.sleep(1000);
		System.out.println("checkbox value:"+checkbox.isDisplayed());
		
		
		
		

	}

}
