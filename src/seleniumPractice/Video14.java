package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll('0','900')");
		
		// How to check the specific check box 
		// This should select monday wala check box
	//1-->	driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		
		//List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']/parent::label"));
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
//	2-->	for(WebElement element : list)
//		{
//			element.click();
//		}
		
		
/* 3--->		for(WebElement element : list)
		{
			String s = element.getAttribute("id");
			System.out.println(s);
			if(s.equals("monday") || s.equals("sunday"))
			{
				element.click();
			}
		}*/
		
		
		//4 -->Scenario most imp-->
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
