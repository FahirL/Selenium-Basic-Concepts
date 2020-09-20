package other;


import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;


public class HttpsSsl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		//SSl certificates


		//general chrome profile
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		//ch.acceptInsecureCerts();
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\FahirL\\\\Documents\\\\Work files\\\\browsers\\\\chromedriver.exe");
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
	
		




		}

		}
	


