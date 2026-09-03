package Day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        
         // self - selects the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/self::a")).getText();
        System.out.println("Self : " + text);
        
        
        //Parent - selects the parent of the current node(always one)
        text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/parent::td")).getText();
        System.out.println("Parent : " + text);
        
        
        //Child → Selects all children of the current node (one or many)
        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements: " + childs.size());
        
        
      //Ancestor - Selects all ancestors (parent, grandparent, etc.)
        text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr")).getText();
        System.out.println("Ancestor : " + text);
        
        
      //Descendant - Selects all elements inside the current node
        List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/descendant::td"));
        System.out.println("Number of descendant elements: " + descendants.size());
        
        
      //Following - Selects all elements after the current node
        List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/following::a"));
        System.out.println("Number of following elements: " + following.size());
        
        
      //Preceding - Selects all elements before the current node
        List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/preceding::a"));
        System.out.println("Number of preceding elements: " + preceding.size());
        
        
      //Following-sibling - Selects elements after the current node with the same parent
        List<WebElement> followingSibling = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/parent::td/following-sibling::td"));
        System.out.println("Number of following-sibling elements: "+ followingSibling.size());
        
        
      //Preceding-sibling - Selects elements before the current node with the same parent
        List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/parent::td/preceding-sibling::td"));
        System.out.println("Number of preceding-sibling elements: "+ precedingSibling.size());

        driver.quit();
    }
}