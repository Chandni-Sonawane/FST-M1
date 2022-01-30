import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title is:"+driver.getTitle());
		
		WebElement textReturn=driver.findElement(By.cssSelector("div#dynamicText"));////need to ask this
		
		System.out.println("enable is:" +textReturn.isEnabled());
		
		driver.findElement(By.cssSelector("button#toggleInput")).click();
		System.out.println("enable is:" +textReturn.isEnabled());
		
		driver.close();
		

	}

}
