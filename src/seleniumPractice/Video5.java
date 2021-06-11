package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fregister");
		Thread.sleep(3000);
	//	driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
		
		/*
		 What is the diff b/w  driver.navigate().to("https://www.facebook.com/"); and 
		 driver.get("https://www.facebook.com/");
		 
		 get() --> method is used to navigate to particular URL and wait until the page gets fully loaded
		 
		 navigate.to()--> this method is also used to navigate to URL but it does not wait to page fully loaded, it maintains the browser history 
		 that's why it handles the navigation means forward() and back() methods. 
		 
		 	public void get(String url) {
    		execute(DriverCommand.GET, ImmutableMap.of("url", url));
  			}  --> This is the definition of get method written inside the "RemoteWebDriver" class, means jab hum get() method call karte hai to internally ye method call hoti hai.
  			
  			
  			
  		==>	aur waise dekha jaye agar hum "navigate.to()" ye method call karte hai to internally "to()" method bhi get() method hi call karta hai aur is trha se
  			dono methods(driver.get() and driver.navigate.to() ) me koi difference nai hai.
  			
  			  public void to(String url) {
      				get(url);
    			}

    			public void to(URL url) {
      				get(String.valueOf(url));
    			}
    			
    		driver.get(String url)--> this method accept string type of URL
    		driver.navigate().to()--> this method accept String parameters as well as URL instance as parameters.
		 
		 * 
		 * */
		

	}

}
