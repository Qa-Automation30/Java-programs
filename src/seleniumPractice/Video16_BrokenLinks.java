package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video16_BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		WebDriver driver;
		int brokenLinkscount=0;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");
		
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links->"+links.size());
		
		for(WebElement elements : links)
		{
			String url = elements.getAttribute("href");
			if(url ==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.connect();
			if(con.getResponseCode()>=400)
			{
				System.out.println("This is the broken link->"+elements.getAttribute("href")+"-->"+con.getResponseCode());
				brokenLinkscount++;
			}
			
		}
		System.out.println("Total broken links count->"+brokenLinkscount);
		Thread.sleep(3000);
		driver.quit();

	}

}
