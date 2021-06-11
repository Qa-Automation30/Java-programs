package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Video8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fget-started");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//select[@id='CountryId']"));
		
		Select select = new Select(element);
		select.selectByVisibleText("American Samoa");
		Thread.sleep(3000);
		select.selectByValue("473");
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);
		
		//=================================================================================
		//Now the question is how you can write your SELECT class logic without using inbuild select class.  ?
		/*  menas select class use nai karna hai, to hum apna khud ka logic likhege
		 * 		 * */
		
		List<WebElement> options = select.getOptions();  // This will return all the options which is associated with select tag. bole to jitne options hoge wo sab return karega.
		for(WebElement option : options)
		{
			if(option.getText().equals("Russia"))
			{
				option.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial/");
	/*	Select emp = new Select(driver.findElement(By.xpath("//select[@name='NoOfEmployees']")));
		Select industry = new Select(driver.findElement(By.xpath("//select[@name='Industry']")));	
		Select country = new Select(driver.findElement(By.xpath("//select[@name='Country']")));	*/
		
		WebElement employees = driver.findElement(By.xpath("//select[@name='NoOfEmployees']"));
		WebElement industry = driver.findElement(By.xpath("//select[@name='Industry']"));
		WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
		selectOptionFromDropDown(employees,"21 - 25");
		Thread.sleep(3000);
		selectOptionFromDropDown(industry,"Agriculture/Forestry");
		Thread.sleep(3000);
		selectOptionFromDropDown(country,"Algeria");
		Thread.sleep(3000);
		driver.quit();

	}
	public static void selectOptionFromDropDown(WebElement element, String value)
	{
		Select s1 = new Select(element);
		List<WebElement> dropdown = s1.getOptions();
		for(WebElement ele : dropdown)
		{
			if(ele.getText().equals(value))
			{
				ele.click();
				break;
			}
		}
		
	}

}
