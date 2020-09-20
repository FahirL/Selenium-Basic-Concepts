package action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\FahirL\\Documents\\Work files\\browsers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://accounts.google.com/signup");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[2]/div[2]/div")).click();
        System.out.println(driver.getTitle());
        Set<String>ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        
        String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
	}

}
