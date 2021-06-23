package june112021;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcept {

		static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fget-started");
		Thread.sleep(3000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='CountryId']"));
		
		Select select = new Select(element);
		List<WebElement> elements =	select.getOptions();
		System.out.println(elements.size());
		Thread.sleep(3000);
		for (WebElement webElement : elements) {
			if(webElement.getText().equals("Mauritania"))
			{
				webElement.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
