package mouseActions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop 
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
		driver.get("https://www.flipkart.com/mens-clothing/pr?sid=2oq,s9b&otracker=categorytr"
				+ "ee&otracker=nmenu_sub_Men_0_Clothing");
		
		WebElement a = driver.findElement(By.xpath("//span[text()='Men']"));
		WebElement b = driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']/a[text()='T-Shirts']"));
		Actions action = new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).perform();		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='_1KCOnI _3ZgIXy']/a[text()='T-Shirts']")));
		action.moveToElement(driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']/a[text()='T-Shirts']")));
		action.click().perform();
		//driver.findElement(By.className("jnSYHL")).click();		
	}
}
