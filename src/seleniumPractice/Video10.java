package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Video10 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// How to handle JQuery dropdown....
		
		// very imp video. String ka ek conecpt bhut imp hai... video dekho
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dropdown m-b']/button[@type='button']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//button[@type='button']/parent::div[@class='dropdown m-b open']/ul/li"));
		System.out.println(elements.size());
		
		for(WebElement ele : elements)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("Another action"))
			{
				ele.click();
				break;
			}
		}
		
		driver.quit();	

	}

}
