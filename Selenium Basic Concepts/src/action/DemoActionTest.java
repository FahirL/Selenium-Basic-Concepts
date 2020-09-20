package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a[contains(@id,'nav-link-accountList')]
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FahirL\\Documents\\Work files\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions a= new Actions(driver);
        WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
        //Moves to specific element
        a.moveToElement(move).build().perform();

	}

}
