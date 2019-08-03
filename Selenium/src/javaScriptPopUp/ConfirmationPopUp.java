package javaScriptPopUp;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationPopUp 
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
		driver.get("file:///C:/Users/mallikar/Desktop/pop-ups/Confirmation_pop_up.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		
		String ok = "You pressed OK!";
		String cancel = "You pressed Cancel!";
		
		//clicking on OK button
		//alert.accept();
		//clicking on Cancel
		alert.dismiss();
		if(driver.findElement(By.id("demo")).getText().equals(ok))
		{
			System.out.println("User clicked on OK button");
		}
		else
		{
			System.out.println("User clicked on Cancel button");
		}
			
		Thread.sleep(2000);
		driver.close();
		
	}
}
