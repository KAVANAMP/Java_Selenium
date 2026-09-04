package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
        //get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle() - returns the title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns the source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single browser window
		//String windowid=driver.getWindowHandle();
		//System.out.println("Window ID:"+windowid); //A8A2CD8458BAC7E5B04E16F731A41B54
		                                           // id s are always changing
		
		//getWindowHandles() - returns ID's of the multiple browser windows
         driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window
         Set<String> windowids=driver.getWindowHandles();
         System.out.println(windowids);

	}

}
