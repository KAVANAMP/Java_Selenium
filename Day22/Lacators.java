package Day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lacators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize(); //used to maximize window
		
		//name
		//driver.findElement(By.name("username")).sendKeys("tomsmith");
		

		//System.out.println(status);
		
		//id
		//boolean status1 = driver.findElement(By.id("dropdown")).isDisplayed();
		//System.out.println(status1);
		
		//Linktext or partialLinkText
        //driver.findElement(By.linkText("A/B Testing")).click();
         driver.findElement(By.partialLinkText("A/B")).click(); //It is the part of the actual link test(not recommended)
		
         //className
        //List<WebElement> headerLinks=driver.findElements(By.className("dns-prefetch"));
        //System.out.println("total no of header links:" +headerLinks.size());
         
         //TagName
         //List<WebElement> headerLinks=driver.findElements(By.className("a"));
         //System.out.println("total no of links:" +headerLinks.size());
         
         //total img
         List<WebElement> headerLinks=driver.findElements(By.className("img"));
         System.out.println("total no of images:" +headerLinks.size());
		

	}

}
