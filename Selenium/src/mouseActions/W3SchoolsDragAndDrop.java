package mouseActions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W3SchoolsDragAndDrop 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		   js.executeAsyncScript("window.scrollBy(0,3100)");
		   Thread.sleep(5000);
		   WebElement frame = driver.findElement(By.xpath("//iframe[@src='tryhtml5_draganddrop_ifr.htm']"));
		   driver.switchTo().frame(frame);
		   WebElement src = driver.findElement(By.id("drag1"));
		   WebElement dest = driver.findElement(By.id("div2"));
		   Actions action = new Actions(driver);
		   action.dragAndDrop(src, dest).perform();
	}
}
