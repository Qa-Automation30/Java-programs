package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video21_DynamicWebTable_1 {

	public static void main(String[] args) throws InterruptedException {
		//Most imp video for interview--> waps video dekho
	
		// How to findOut total number of pages in a dynamic web table-> means kitne tabs hai usme 1 to 100 hai yaa 1 to 200 hai..
		// Showing 1 to 20 of 9089 (455 Pages)
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/admin/");
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("demo");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//a[text()=' Sales']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//li[@id='menu-sale']/ul/li/a[text()='Orders']")).click();
		Thread.sleep(3000); 
		String text =driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText(); // Showing 1 to 20 of 9089 (455 Pages)
		System.out.println(text);
		//yaha se imp logic hai-->
		int indexOfOpenBracket =	text.indexOf("(");
		int indexOfpages	=	text.indexOf("Pages");
		String totalPages = text.substring(indexOfOpenBracket+1, indexOfpages-1);
		System.out.println("Total number of pages-->"+Integer.parseInt(totalPages)); //455 print karega only
		
		for(int p=1;p<=Integer.parseInt(totalPages);p++)
		{
			WebElement activePageLink = driver.findElement(By.xpath("//ul[@class='pagination']/li/span"));
			activePageLink.click();
			System.out.println("Active links->"+activePageLink.getText());
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
			System.out.println("No of rows->"+rows);
			String pageNumber = Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+pageNumber+"']")).click();
		}
		
		for(int p=1;p<=Integer.parseInt(totalPages);p++)
		{
			WebElement activePageLink = driver.findElement(By.xpath("//ul[@class='pagination']/li/span"));
			activePageLink.click();
			System.out.println("Active links->"+activePageLink.getText());
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
			System.out.println("No of rows->"+rows);
			for(int r=1;r<rows;r++)
			{
				
			}
			String pageNumber = Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+pageNumber+"']")).click();
		}
		
		
		
		driver.quit();

	}

}
