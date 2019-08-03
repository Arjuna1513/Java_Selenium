package verticalAndHorizontalScrolling;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HorizontalScroll 
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
		driver.get("file:///C:/Users/mallikar/Desktop/Horizontal_Scroll.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(-100,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("span")).getText());
		driver.close();
	}
}
