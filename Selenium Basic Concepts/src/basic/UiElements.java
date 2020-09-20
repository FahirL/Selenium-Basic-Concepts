package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UiElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FahirL\\Documents\\Work files\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       

        
        driver.get("https://m.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        
        
     //   System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
       // System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {	
        	System.out.println("its enable");
        	Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertFalse(false);
        }
	}

}
