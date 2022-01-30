import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activit_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		System.out.println("Title is:"+driver.getTitle());

		System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/h3")).getText());
		
		System.out.println("fifthHeader is:"+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/h5")).getCssValue("color"));
		
		String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("text()");
		System.out.println("violetButtonClasses is:" +violetButtonClasses);
		
		String greyButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Grey button is:"+greyButton);
		
		
		

	}

}
