package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video18_FrameAndIFrame {

	public static void main(String[] args) throws InterruptedException {
		
		//Frames --> Frames means we can split single page in multiple sections and wo sare section ek hi page me hote hai
		//Iframes ---> means agar ek page pe hume kuch dikhana hai to hum kahi aur se content laake dikhayege us page pe , jaise pages pe hota hai generally advertisemnt ke case me.
		
		//Iframe means which is having some content which is coming from diff source.
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		/*Exception in thread "main" org.openqa.selenium.NoSuchElementException: Unable to locate element: //a[contains(text(),'org.openqa.selenium')]
		 * 
		 * Ye exception tab bhi ata hai jab element kisi frame ke under me present ho.aur you want to click on it.
		 * 
		 * So uske liye phle frame me switch karna padega. driver.switchTo().frame("packageListFrame");--> like this
		 * 
		 * 
		 * */
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium')]")).click();
		
		driver.switchTo().defaultContent(); // Ye command se waps main page me driver point ho jayega. and ye karna must hai agar 1 frame pe kuch opertaion perform kar liya hai to waps main page me ana padega.
		Thread.sleep(2000);
		driver.quit();

	}

}
