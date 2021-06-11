package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenLinksAndImages {

	public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver","F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.covid19india.org/");
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		totalLinks.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("total image and anchor tag on page->"+ totalLinks.size());
		
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i=0;i<totalLinks.size();i++)
		{
			if(totalLinks.get(i).getAttribute("href")!=null)
			{
				activeLinks.add(totalLinks.get(i));
			}
		}
		System.out.println("active links and images on page-->"+activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection conn = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			conn.connect();
			String response=conn.getResponseMessage();
			conn.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+response);
		}
		driver.quit();
	}
	

}
