package allAboutFrames;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class I_Frame2 
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
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		//driver.switchTo().f
		
		//getting the text from the webpage before entering frame
		String text = driver.findElement(By.xpath("//div[@class='page-title-head hgroup']")).getText();
		System.out.println(text);
		
		//entering the frame
		driver.switchTo().frame("IF1");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("IF2");
		//getting the text from the element in the frame.
		System.out.println(driver.findElement(By.xpath("//li[@class='active']")).getText());
		
		//again trying to get the text from the page outside frame and this leads to NoSuchElementException
		//beacuse we are still in frame so come out of the frame.
		driver.switchTo().defaultContent();
		String text1 = driver.findElement(By.xpath("//div[@class='page-title-head hgroup']")).getText();
		System.out.println(text1);
		//calculating the total number of frames using findElements method
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		 Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		 System.out.println("Number of iframes on the page are " + numberOfFrames);
	}
}
