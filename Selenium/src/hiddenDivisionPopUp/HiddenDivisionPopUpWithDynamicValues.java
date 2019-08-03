package hiddenDivisionPopUp;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopUpWithDynamicValues 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		Date date = new Date();
		//get the date
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String day = sdf.format(date);
		System.out.println(day);
		
		//get the month
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
		String month = sdf1.format(date);
		System.out.println(month);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='"+month+"']/parent::div//parent::div//parent::div//a[.='"+day+"']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
