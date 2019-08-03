package mouseActions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop3 
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.get("https://code.makery.ch/library/dart-drag-and-drop/");	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://marcojakob.github.io/dart-dnd/basic/']")));	
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='trash']"));
		action.dragAndDrop(src, dest).perform();
		Thread.sleep(2000);
		
		WebElement src1 = driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement dest1 = driver.findElement(By.xpath("//div[@class='trash full']"));
		
		action.dragAndDrop(src1, dest1).perform();
		Thread.sleep(5000);
		driver.close();
	}
}
