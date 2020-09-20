package basic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


/*import com.sun.tools.javac.util.Assert; */

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FahirL\\Documents\\Work files\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       

        
        driver.get("https://m.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
       // driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
       // System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        
        
        //count the number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
    	 driver.findElement(By.id("divpaxinfo")).click();
    	Thread.sleep(2000L);
    	
    	/*int i=1;
    	while(1<5)
    	{
    		driver.findElement(By.id("testtest")).click(); // 4 times
            i++;
    	}*/
        for(int i=1; i<5; i++)
        {
        	driver.findElement(By.id("testtest")).click();
        	
        }
      /*  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult"); */
    	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
