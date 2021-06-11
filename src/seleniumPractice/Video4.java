package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fregister");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"register-page\"]/body/div[6]/header/div/div[3]/a"));
		boolean b = element.isDisplayed();  // Means koi WebElement page pe display ho raha hai ki nai uske liye use karte hai.
		System.out.println("Result would be true-->"+b);
		
		driver.findElement(By.id("register-button")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//span[@id='FirstName-error']"));
		/*
		 * Exception in thread "main" org.openqa.selenium.NoSuchElementException: Unable to locate element: //span[@id='FirstName-error']
		 * 
		 * upar wali 26th line ko comment kar dege tab ye exception ayega
		 * 
		 * 
		 * */
		boolean b1 = element2.isDisplayed();
		System.out.println("Result would be false-->"+b1);
		
		
		//isSelected() Method used for-> radioButtons, CheckBoxes and for DropDowns(that values has been selected or not)
		
		
	boolean b2=	driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
	System.out.println("This should be true-->"+b2);
	Thread.sleep(3000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[@for='Newsletter']")).click();
	
	Thread.sleep(3000);
	
	boolean b3=	driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
	System.out.println("This should be false-->"+b3);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
