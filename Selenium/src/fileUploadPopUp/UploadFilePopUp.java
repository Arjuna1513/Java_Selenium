package fileUploadPopUp;

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

public class UploadFilePopUp 
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
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");	
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.xpath("//input[@name='files[]']"));
		//wait.until(ExpectedConditions.elementToBeClickable(upload));
		//Thread.sleep(2000);
		upload.sendKeys("C:\\google.png");
		//sendKeys("C:\\Users\\mallikar\\Desktop\\google.png");
		Thread.sleep(5000);
		driver.close();
	}
}
