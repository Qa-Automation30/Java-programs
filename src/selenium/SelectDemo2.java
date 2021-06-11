package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SelectDemo2 {
	public static WebDriver driver;
	public static WebDriverWait _wait;
	public static void setup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.findElement(By.xpath("//ul[@id='treemenu']//ul//a[text()='Input Forms']")).click();
		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
		Actions AS1 = new Actions(driver);
		String[] selectThisCities = {"New York","New Jersey","Washington","Pennsylvania"};
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(3000);
		for(int i=0;i<selectThisCities.length;i++)
		{
			String cityXpath = 
				"//select[@id='multi-select']//option[text()='"
				+selectThisCities[i]+
				"']";
			WebElement option = driver.findElement(By.xpath(cityXpath));
			AS1.keyDown(Keys.CONTROL).click(option).build().perform();
			//Thread.sleep(2000);
		}
		
		//Some how below commented code was not giving me all the selected value 
		
		/*
		 * s2.selectByVisibleText("New York"); 
		 * s2.selectByVisibleText("New Jersey");
		 * s2.selectByVisibleText("Washington"); 
		 * s2.selectByVisibleText("Pennsylvania");
		 */
		
		driver.findElement(By.xpath("//button[text()='Get All Selected']")).click();
		Thread.sleep(3000);
		
		
		String answer = driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();
		
		String formated1 = answer.substring(23,answer.length());
		System.out.println(formated1);
		String[] expectedCities = formated1.split("[,]",0);
		Assert.assertEquals(selectThisCities, expectedCities);
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		setup();
	}

}
