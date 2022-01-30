import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_2 {
	
	public static void main(String args[]) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls ");
		System.out.println("Title is:"+driver.getTitle());
		
		WebElement isSelected= driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("selected is:"+isSelected.isSelected());
		
		isSelected.click();
		System.out.println("selected is:"+isSelected.isSelected());
		
		driver.close();
		
		
		
		
	}

}
