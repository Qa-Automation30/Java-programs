package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video13 {

	public static void main(String[] args) throws InterruptedException {
		/*AutoComplete google places drop down
		 * 
		 * very imp
		 * 
		 * */
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Toronto"); 
		Thread.sleep(3000);
		//once you paas this Toronto it will return some results which you can not inspect bcs ye sare result server se
		//	aa rahe hai run time pe.
		// so yaha se hum ye findout nai kar sakte ki kitne option aa rai hai.
		
		String text = "";
		do 
		{
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN); 
			text = driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
			if(text.equals("Toronto Road, Bristol, UK"))
			{
				driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ENTER);
				break;
			}
		}
		while(!text.isEmpty());
		Thread.sleep(3000);
		driver.quit();
		

	}

}
