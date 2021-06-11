package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video9 {

	public static void main(String[] args) throws InterruptedException {
		
		//BootStrap dropdown ko kaise handle kiya hai wo code hai
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]")).click();
		
		List<WebElement> values = driver.findElements(By.xpath("//a[contains(text(),'Select Product Type')]/parent::div/ul/li"));
		System.out.println(values.size());
		for(WebElement elements : values)
		{
			System.out.println(elements.getText());
		}
		
		driver.quit();
		

	}

}
