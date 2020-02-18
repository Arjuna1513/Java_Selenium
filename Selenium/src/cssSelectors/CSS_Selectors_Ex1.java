package cssSelectors;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_Selectors_Ex1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://10.211.62.254");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*=erI]")).sendKeys("Arjuna");
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Arjuna@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=login]")).click();
		driver.findElement(By.cssSelector("a[id^=Use]")).click();
		driver.findElement(By.cssSelector("a[class=subMenu2itemUnSel]")).click();
		driver.findElement(By.cssSelector("input.buttons1[name=onAddButton]")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
