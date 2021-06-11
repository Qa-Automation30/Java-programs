package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Video19 {
	static WebDriverWait _wait;
	public static void main(String[] args) {
		
WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	WebElement e1=	_wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	e1.click();
		
		// Synchronization problems in automation means -> 
		//Some times kya hota hai ki apki automation script fast hoti hai but apki application ka response slow hota hai.
		// to us case me kyya hota hai exception throw karti hai script. 
		
		// to kaise handle karege isko ?--> isko handle karne ke liye 3 traha ke waits hote hai.
		
		/* 1.Implicit wait
		 2.Explicit wait
		 3. Fluent wait
		 
		 ==========================================================
		 1.Implicit wait  ---> driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 This wait is applicable for all webElements which is present on page. --> This is also known as global wait.
		=============================================================================
		2.Explicit wait --> ye wait particular webElements pe kaam karte hai.
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
			WebDriverWait _wait = new WebDriverWait(driver, 20);
	WebElement e1=	_wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		e1.click();
		=========================================================================================
		3. Fluent wait--> me polling concept hota hai and ye exceptions ko ignore karta hai.. jabki hume explicit wait me try catch ke through exception handle
		karna padta hai but fluint wait me aisa nai hai.
		
		video waps dekho
		
		*/
		
	
	
		
		

	}
	

}
