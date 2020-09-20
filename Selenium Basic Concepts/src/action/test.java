package action;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {


	

			

	        public static void main(String[] args) throws InterruptedException {

	        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\FahirL\\Documents\\Work files\\browsers\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();

	        	

	        	driver.manage().window().maximize();

	        	// driver.get("http://amazon.in");

	        	driver.get("https://accounts.google.com/signup");

	        	System.out.println("Before Switching");

	        	System.out.println(driver.getTitle());

	        //	driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

	        	driver.findElement(By.xpath("//a[contains(text(),'Privatnost')]")).click();

	        	Set<String>ids=driver.getWindowHandles();

	        	Iterator<String>it=ids.iterator();

	        	String parent=it.next();

	        	String child1=it.next();

	        	String child2=it.next();

	        	    driver.switchTo().window(child1);

	        	System.out.println("After Switching");

	        	System.out.println(driver.getTitle());

	        	driver.switchTo().window(child2);

	        	System.out.println("Second Tab");

	        	System.out.println(driver.getTitle());

	        	driver.switchTo().window(parent);

	        	System.out.println("Back to parent");

	        	System.out.println(driver.getTitle());

	        	}

	        	}