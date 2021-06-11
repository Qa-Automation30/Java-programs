package seleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Video15 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		String windowId = driver.getWindowHandle();  // return the id of the single browser window
		System.out.println("kajdfjkaf");
		System.out.println("Id of a single window-->"+windowId);
		
		
		
	//	driver.getWindowHandle(); // This will return the id in string format of single window , which actually open.
	//	driver.getWindowHandles(); //This will return the set<String> of id's of multiple window.
		
		driver.findElement(By.xpath("//button[contains(text(),'New Tab')]")).click();
		
	//	Set<String> windowIds =driver.getWindowHandles();
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		
		System.out.println("parent window id->"+parentWindowId);
		System.out.println("child window id->"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window title->"+driver.getTitle());
		
		
		Thread.sleep(3000);
		driver.close(); // This will close single window means driver jaha pe latest point hoga. (close command current wali window ko close karega jaha pe driver pointed hoga)
		driver.quit(); // ye sare open windows ko close kar dega.

	}

}
