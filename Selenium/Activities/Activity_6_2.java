import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		WebDriverWait w= new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("Title is:"+driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(text(),'Change Content')]")).click();
		
		w.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);
        
        w.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        
        
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);
		
		
		
		

	}

}
