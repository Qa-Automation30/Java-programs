package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video16 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Fashion")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(3000);
		
		
		
		// Ab hume page ke sare links geather karne hai to uske liye we have one tag which
		// is known as anchor tag , so anchor tag basically links hote hai.
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println(links.size());
		Thread.sleep(3000);
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}
		// Now how to handle the broken links :
		ArrayList<WebElement> activeLinks = new ArrayList<>();
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href")!=null)
			activeLinks.add(links.get(i));
		}
		System.out.println("Active links-->"+activeLinks.size());
		for(int i=0;i<activeLinks.size();i++)
		{
			HttpURLConnection con = (HttpURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
			con.connect();
			String response=con.getResponseMessage();
			System.out.println(activeLinks.get(i).getAttribute("href")+"-->"+response);
			con.disconnect();
			
		}
		
		
		
		driver.quit();
		

	}

}
