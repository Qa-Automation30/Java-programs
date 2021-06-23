package interViewOn18June;

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

public class FindBrokenLinksAndImages {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.covid19india.org/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href")!=null)
			{
				activeLinks.add(links.get(i));
			}
		}
		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection con = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			con.connect();
			String resopnse = con.getResponseMessage();
			System.out.println(resopnse);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
