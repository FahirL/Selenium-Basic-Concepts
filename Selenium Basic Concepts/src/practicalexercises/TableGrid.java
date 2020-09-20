package practicalexercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\FahirL\\Documents\\Work files\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		int sum=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30235/eng-vs-aus-3rd-odi-australia-tour-of-england-2020");
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] ")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0; i<count-2;i++)
		{
			//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=Integer.parseInt(value);
		sum=sum+valueinteger;
		}
	//	System.out.println(sum);
         String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
         int extrasValue=Integer.parseInt(Extras);
         int TotalSumValue=sum+extrasValue;
         System.out.println(TotalSumValue);
         
         String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
         int ActualTotalValue=Integer.parseInt(ActualTotal);
         if(ActualTotalValue==TotalSumValue)
         {
        	 System.out.println("Count Matches");
         }
         else {
        	 System.out.println("Count Fail");
         }
	}

}
