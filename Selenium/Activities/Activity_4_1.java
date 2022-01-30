import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.training-support.net");
		String title=driver.getTitle();
		System.out.println("Title is:" +title);
		
		WebElement Button= driver.findElement(By.xpath("//a[@id='about-link']"));
		System.out.println("Button is:"+Button);
		Button.click();
		
		WebElement text=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/h1"));
		System.out.println("title is:"+text.getText());
		
		
		driver.navigate().back();
		driver.close();
		
		
	
		
		

	}

}
