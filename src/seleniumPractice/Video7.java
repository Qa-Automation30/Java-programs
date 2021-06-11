package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video7 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com");
		
		driver.findElement(By.xpath("")).clear();
		
		// video dekh lo
		
		//getText()   VS getAttribute("")-->
		
		
		//getAttribute("")--> iske through hum tags ki values ko extract kar sakte hai.
		/*<input name ="usename">
		 * <input id="viveksID">
		 * 
		 *  getAttribute("name") --> to ye userName return karega.
		 *  getAttribute("id") --> to ye viveksID return karega.
		 * 
		 * */

	}

}
