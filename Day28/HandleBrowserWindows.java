package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        // Click link which opens another window
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        // Get all window IDs
        Set<String> windowIDs = driver.getWindowHandles();

        // Approach 1: Convert Set to List ->for switchong 2 windows
        /*List<String> windowList = new ArrayList<String>(windowIDs);

        String parentID = windowList.get(0);
        String childID = windowList.get(1);

        // Switch to child window
        driver.switchTo().window(childID);
        System.out.println("Child Window: " + driver.getTitle());

        // Switch back to parent window
        driver.switchTo().window(parentID);
        System.out.println("Parent Window: " + driver.getTitle());
*/
        
        //Approach2 ->for switching multiple windows
        
        for(String winId:windowIDs)
        {
        	String title=driver.switchTo().window(winId).getTitle();
        	
        	if(title.equals("OrangeHRM"))
        	{
        		System.out.println(driver.getCurrentUrl());
        	}
        }
        
        driver.quit();
    }
}