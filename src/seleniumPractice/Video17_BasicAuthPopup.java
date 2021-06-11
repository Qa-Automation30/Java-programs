package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video17_BasicAuthPopup {

	public static void main(String[] args) throws InterruptedException {
		
		// This is the example of basic auth popup message->
		
		// Basic autun popup me hume URL me hi username and password pass karna padega.
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//syntax : would be like --> 
		// http://admin:admin@now paste the URL here (So this is how we can handle the authenitaction popup)
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.quit();

	}

}
