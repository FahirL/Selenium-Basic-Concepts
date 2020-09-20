package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExerciseCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FahirL\\Documents\\Work files\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	driver.manage().window().maximize();
    	
    	// check - uncheck checkbox
    	driver.findElement(By.id("checkBoxOption1")).click();
    	Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
    	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
    	driver.findElement(By.id("checkBoxOption1")).click();
    	Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
    	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
    	
    	//count checkboxes
    	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    	
	}

}
