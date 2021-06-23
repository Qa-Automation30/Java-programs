package interViewOn18June;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		String beforeXpathCompany ="//table[@class='dataTable']/tbody/tr[";
		String afterXpathCompany ="]/td[1]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		
		for(int i=1;i<=rows.size()-1;i++)
		{
			String actualXpathCompany = beforeXpathCompany+i+afterXpathCompany;
			System.out.println(driver.findElement(By.xpath(actualXpathCompany)).getText());
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
