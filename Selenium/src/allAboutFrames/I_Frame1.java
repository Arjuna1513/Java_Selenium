package allAboutFrames;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class I_Frame1 
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
		driver.get("http://the-internet.herokuapp.com/tinymce");
		//Identify the iframe by using id or name or WebElement
		WebElement frame = driver.findElement(By.id("mce_0_ifr"));
		//Now switch to iFrame using frame method
		driver.switchTo().frame(frame);
		//identify any element in iframe
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Selenium Tutorials");
		
		//we ll get NoSuchElementException bcoz we are in iframe and trying to access element outside the iFrame.
		//so switch to default content before we access anyElement outside the iFrame
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	
	}
}
