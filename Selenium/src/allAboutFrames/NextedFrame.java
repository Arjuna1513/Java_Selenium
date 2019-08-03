package allAboutFrames;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NextedFrame 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		
		//Always give the precedence for frame with index as it is faster compared to id/name/webelement.
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/mallikar/Desktop/iframes/demo1.html");
		
		//identify element in main webpage page
		driver.findElement(By.id("fn")).sendKeys("Mallikarjuna");
		//find out the total number of frames in main page
		 List<WebElement> list = driver.findElements(By.tagName("iframe"));
		 System.out.println("Total iframes in main page is :"+ list.size());
		 
		 //now switch to frame 1
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("mn")).sendKeys("Arjuna");
		 
		//find out the total number of frames in frame 1
		 List<WebElement> list1 = driver.findElements(By.tagName("iframe"));
		 System.out.println("Total iframes in Frame 1:"+ list1.size());
		 
		 //now switch to Nested Frame 2
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("ln")).sendKeys("Byalihal");
		 
		 //now switch back to frame 1
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("ph")).sendKeys("7975935256");
		 
		 //now come to default/main page again
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("addr")).sendKeys("Bengaluru");
		 driver.close();
	}
}
