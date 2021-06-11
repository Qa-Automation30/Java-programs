package selenium;

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
	public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver","F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://makemysushi.com/");
		
	List<WebElement> totalLinks=	driver.findElements(By.tagName("a"));
	totalLinks.addAll(driver.findElements(By.tagName("img")));
	
	System.out.println("totalLinks present on page-->"+totalLinks.size());
	
	List<WebElement> activeLinks = new ArrayList<WebElement>();
	List<WebElement> activeLinks1 = new ArrayList<WebElement>();
	for (WebElement webElement : totalLinks) {
		if(webElement.getAttribute("href")!=null && (!webElement.getAttribute("href").contains("javascript")))
		{
			activeLinks.add(webElement);
		}
	}
	for(int i=0;i<totalLinks.size();i++)
	{
		//System.out.println(totalLinks.get(i).getAttribute("href"));
		if(totalLinks.get(i).getAttribute("href")!=null)
		{
			activeLinks1.add(totalLinks.get(i));
		}
	}
	for(int i=0;i<activeLinks.size();i++)
	{
		HttpURLConnection conn = (HttpURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
		conn.connect();
		String response = conn.getResponseMessage();
		conn.disconnect();
		System.out.println(activeLinks.get(i).getAttribute("href")+"-->"+response);
	}
		System.out.println("activeLinks present on page-->"+activeLinks.size());
		System.out.println("activeLinks1 present on page-->"+activeLinks1.size());
		driver.close();
		System.out.println("closed the driver");
	}

}
