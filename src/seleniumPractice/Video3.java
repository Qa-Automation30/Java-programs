package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
	/*	1-> Ye interview me pucha gaya tha ki exact key likh ke bato --> "webdriver.gecko.driver"
		webdriver.geko.driver --> Key for FF browser
		webdriver.chrome.driver -->Key for Chrome browser
		webdriver.edge.driver --> Key for IE browser
*/		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Title of the webpage-->"+title);
		System.out.println("URL of the page->"+driver.getCurrentUrl());
		Thread.sleep(3000);
		System.out.println("============");
		System.out.println(driver.getPageSource());
		Thread.sleep(3000);
		driver.quit();
		
		/*
		 ek dossra tarika bhi hai browser ko launch karne ka jaha pe ye advantage hai ki hume physically exe files download nai karni padegi
		 and path bhi set nai karna padega --> Uske liye hum "WebDriverManager" use karege.
		 
		 WebDriverManager is a library which allows to automate the management of the drivers 
		 (e.g. chromedriver, geckodriver, etc.) required by Selenium WebDriver.  --> Ise bonigarcia ke name se bhi jaante hai.
		 
		 so iske liye karna kya hoga--> POM me bus ek dependency add karni hai-->>
		 		<dependency>
    			<groupId>io.github.bonigarcia</groupId>
    			<artifactId>webdrivermanager</artifactId>
    			<version>4.4.3</version>
    			<scope>test</scope>
				</dependency>
				
				ye dependency add kiyye bina nai chalega. bus ye add kar do aur mauj karo. :P
				
				iske baad bus 1 line hi likhni hogi->
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
				iske baad code jaise ka taisa hi likhna hai. bus upar ki 2 line imp hai, isme na to path set karna hai aur naa hi key pass karni hai.
				means physically kuch nai rakhna hai system me.
				
				WebDriverManager ka advantage ye hai ki driver ko download nai karna padega aur na uske liye koi key ya path set karna padega.
		 * */
		

	}

}
