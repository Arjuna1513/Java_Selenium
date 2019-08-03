package verticalAndHorizontalScrolling;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerticalScrolling 
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
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,100)");
		//Thread.sleep(3000);
		/*js.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(3000);
			
		//scrolling 10 times 100 pixels each
		for(int i=0; i<10; i++)
		{
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}
		
		//de-scrolling 10 times 100 pixels each
		for(int i=0; i<10; i++)
		{
			js.executeScript("window.scrollBy(0,-200)");
			Thread.sleep(1000);
		}*/
		
		//scroll to the location where element is present and then click the link.
		int y = driver.findElement(By.linkText("Learn more about sponsorship")).getLocation().getY();
		y=y-200;//here y value has the index for the entire window but when we give value in the scroll bar it is actally
		//the pixel value of only web pahe hence we are subtracting it by 200. to get the correct scroll.		
		
		/*js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(2000);*/
		
		//driver.findElement(By.linkText("Learn more about sponsorship")).click();
		//Thread.sleep(2000);
		
		//for the complete scroll.
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.close();
	}
}
