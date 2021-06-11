package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;

public class Test {
	public static WebDriver driver;
	
	@SuppressWarnings("unlikely-arg-type")
	public static void steup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","F:\\Projects\\JavaPrograms\\src\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		driver.findElement(By.xpath("//select[@id='multi-select']"));
		
		String stringArray[] = {"California","Ohio","Washington"};
		Actions action = new Actions(driver);	
		WebElement e1 = driver.findElement(By.xpath("//select[@name='States']/option[@value='"+stringArray[0]+"']"));
		System.out.println(e1.getText());
		WebElement e2= driver.findElement(By.xpath("//select[@name='States']/option[@value='"+stringArray[1]+"']"));
		System.out.println(e2.getText());
		WebElement e3= driver.findElement(By.xpath("//select[@name='States']/option[@value='"+stringArray[2]+"']"));
		System.out.println(e3.getText());
	
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		action.keyDown(Keys.CONTROL).click(e1).click(e2).click(e3).keyUp(Keys.CONTROL);		
		Thread.sleep(3000);
		action.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Get All Selected']")).click();
		Thread.sleep(3000);
		String getText = driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();
		System.out.println(getText); //Options selected are : California,Ohio,Washington
		
		
		String colon = getText;
		 String[] strings = colon.split(":");
		 String newStr = strings[1];
		 System.out.println(newStr.trim());
		 String[] s = newStr.trim().split(",");
		 List<String> list = new ArrayList<String>();
		 for(int i=0;i<s.length;i++)
		 {
			list.add(s[i]);
		 }
		 System.out.println(list);
		 if(list.contains(stringArray[0]) && list.contains(stringArray[1]) && list.contains(stringArray[2]))
		 {
			 System.out.println("you have selected right");
		 }
		 else
		 {
			 System.out.println("exit");
		 }
		
	
		driver.close();
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		steup();
		
	}
}
