package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.practicesoftwaretesting.com/auth/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//isDisplayed()
		//WebElement firstName = driver.findElement(By.cssSelector("[data-test='first-name']"));
		//boolean status = firstName.isDisplayed();
        //System.out.println("Display status of First Name: "+ status);

		
        //isEnabled()
		//WebElement firstName = driver.findElement(By.cssSelector("[data-test='first-name']"));
        //boolean status = firstName.isEnabled();
        //System.out.println("First Name enabled status: " + status);
        
        
        
        //isSelected()
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		boolean status = male.isSelected();
		System.out.println("Male radio button selected: " + status);
        

	}

}
