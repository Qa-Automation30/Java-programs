package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Video20 {

	public static void main(String[] args) throws InterruptedException {
		//Table example-->
		int nowOfRowsCount=0;
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		
		// 1st operation -> How many number of rows in table->
		
		By by = By.xpath("//table[@class='data-list']/tbody/tr");
		List<WebElement> noOfRows = driver.findElements(by);
		System.out.println("noOfRows in a table->"+noOfRows.size());
		for(int i=0;i<noOfRows.size();i++)
		{
			nowOfRowsCount++;
		}
		System.out.println("noOfRows in a table->"+nowOfRowsCount);
		List<WebElement> noOfColumnts = driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th"));
		System.out.println("noOfColumnts->"+noOfColumnts.size());
		Thread.sleep(3000);
		
		List<WebElement> columnsValue = driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th"));
		System.out.println(columnsValue.size());
		// Retrieve all the data from the table--> V imp concept
		
		int numOfRows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		System.out.println(numOfRows);
		int numOfCol = driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th")).size();
		System.out.println(numOfCol);
		
		for(int row=1;row<=numOfRows;row++)
		{
			for(int col=1;col<=numOfCol;col++)
			{
				String data = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+row+"]/td["+col+"]")).getText();
				System.out.print(data+"--");
			}
			System.out.println("=================================================");
		}
		driver.quit();

	}

}
