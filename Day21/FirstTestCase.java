package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 Test Case
 ----------
 1)Launch browser
 2)Open URL https://demo.opencart.com/
 3)Validate title should be "Your store"
 4)close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		//1)Launch browser(chrome)
		//ChromeDriver driver=new ChromeDriver(); //to launch browser
		WebDriver driver=new ChromeDriver();
		
		//2)Open URL https://demo.opencart.com/
		
		driver.get("https://www.google.com/");
		
		//3)Validate title should be "Your store"
		String act_title=driver.getTitle();
		if(act_title.equals("Google"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		//4)close browser
		//driver.quit();
		driver.close();
	}

}
