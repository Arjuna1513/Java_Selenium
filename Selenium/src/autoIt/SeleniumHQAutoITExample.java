package autoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHQAutoITExample 
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
		driver.get("https://docs.seleniumhq.org/download/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Selenium Html Runner")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\mallikar\\Desktop\\WindowPOPUP.exe");
		Thread.sleep(10000);
		driver.close();
	}
}
