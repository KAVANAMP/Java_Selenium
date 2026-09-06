package Day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		
		//diver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //accepts URl only in the string format

       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //functionality for both are same but internal implementation is different
		
		//URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to(myurl); //it accepts url in both string and object 
		
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
       driver.navigate().to("https://the-internet.herokuapp.com/");
       
       driver.navigate().back();
       System.out.println(driver.getCurrentUrl());
       
       driver.navigate().forward();
       System.out.println(driver.getCurrentUrl());
       
       driver.navigate().refresh();
       
	}

}
