package NaveenSeleniumClassPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class video5_HandlingFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='fileupload']")).sendKeys("C:\\Users\\sriva\\OneDrive\\Desktop\\tttt.txt");
		Thread.sleep(3000);
		driver.quit();

	}

}
