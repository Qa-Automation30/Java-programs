package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Video17_PermissionPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Permission popup-->
		WebDriver driver;
		
	/*	permission popup jo aate hai location ke liye mainly ki allow karna hai location ko ya not allow karna hai
		to uske liye ye 2 lines imp hai.
		
		FirefoxOptions op = new FirefoxOptions();
		op.addArguments("--disable-notification");  and ye 2 line browser to browser depend karti hai. 
		
		and "op" jo refrence variable hai usko firebox driver ke objecct me pass kar dege.
		
		driver = new FirefoxDriver(op); -- is traha se
		
		*/
		FirefoxOptions op = new FirefoxOptions();
		op.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver(op);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.quit();

	}

}
