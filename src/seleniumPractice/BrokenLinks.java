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

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://makemysushi.com/");
		
		Thread.sleep(3000);
		
		ArrayList<WebElement> activeLinks = new ArrayList<>();
		List<WebElement> totalTags = driver.findElements(By.tagName("a"));
		totalTags.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total tags-->"+totalTags.size());
		
		for(int i=0;i<totalTags.size();i++)
		{
			if(totalTags.get(i).getAttribute("href")!=null && (!((WebElement) totalTags).getAttribute("href").contains("javascript")))
			{
				activeLinks.add(totalTags.get(i));
			}
		}
		System.out.println("total Active tags are-->"+activeLinks.size());
		
		for(int i=0;i<activeLinks.size();i++)
		{
			HttpURLConnection con =(HttpURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
			con.connect();
			String message = con.getResponseMessage();
			con.disconnect();
			System.out.println(message);
			
		}
		
		driver.quit();

	}

}
