package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video12 {

	public static void main(String[] args) throws InterruptedException {
		
		// AutoSuggestion dropdown
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@style='display: block;']/ul/li"));
		System.out.println(list.size());
		for(WebElement elements : list)
		{
			System.out.println(elements.getText());
			if(elements.getText().equals("selenium interview questions"))
			{
				elements.click();
				break;
			}
		}
		driver.quit();

	}

}
