package selenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestion 
{	
		static
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		}
		
		public static void main(String[] args) throws InterruptedException, IOException 
		{
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/intl/en-GB/gmail/about/");
			//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			driver.findElement(By.id("identifierId")).sendKeys("advaithab1513@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			WebDriverWait wait = new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='Xb9hP']/input[@type='password']"))));
			driver.findElement(By.xpath("//div[@class='Xb9hP']/input[@type='password']")).sendKeys("RohiArjun@123",Keys.ENTER);
			//driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//driver.findElement(By.id("link_enable_notifications")).click();
			//driver.switchTo().alert().accept();
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='J-Ke n4 ah9 aiu']/span[text()='More']"))));
			driver.findElement(By.xpath("//div[@class='G-asx T-I-J3 J-J5-Ji']")).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnx']"))));
			WebElement dest = driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnx']"));
			WebElement src = driver.findElement(By.xpath("(//span[@name='The Times of India'])[1]"));
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.clickAndHold(src).moveToElement(dest).click().perform();
			//action.dragAndDrop(src, dest).perform();
			
			
			
			
			
			//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("RohiArjun@123");
			
		}
}
