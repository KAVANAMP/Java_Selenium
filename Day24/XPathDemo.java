package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Kavana");
		
		//Xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@id='username'][@name='username']")).sendKeys("Kavana");

		//xpath with 'and' operator
		//driver.findElement(By.xpath("//input[@id='username' and @name='username']")).sendKeys("Kavana");
		
		//xpath with 'or' operator
		//driver.findElement(By.xpath("//input[@id='username' or @name='xyz']")).sendKeys("Kavana");
		
		//xpath with text()
		//driver.findElement(By.xpath("//button[@class='radius']")).click();
		
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@name,'user')]")) .sendKeys("tomsmith");
	}

}
