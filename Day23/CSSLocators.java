package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize(); // maximize the browser window
		
		//tag id
		//driver.findElement(By.cssSelector("input#username")).sendKeys("kavana");
		driver.findElement(By.cssSelector("#username")).sendKeys("kavana"); //tag name is not mandatory
		
		//tag class
		driver.findElement(By.cssSelector("button.radius")).click(); //here also tagis optional
		
		//tag attribute
		//syntax ->("tagname[attribute='value']")
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword!");
		
		//tag class attribute
		//syntax->tag.class[attribute='value']
		driver.findElement(By.cssSelector("button.radius[type='submit']")).click();
	}

}
