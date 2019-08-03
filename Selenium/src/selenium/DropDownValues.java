package selenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValues 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		/*Dimension d = new Dimension(100, 100);
		Point p = new Point(100, 100);
		driver.manage().window().setSize(d);
		driver.manage().window().setPosition(p);*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://10.211.62.204/mp/");
		
		
		WebDriver.Options options = driver.manage();
		WebDriver.Window window = options.window();
		window.maximize();
		driver.findElement(By.name("userId")).sendKeys("Arjuna");
		WebElement element = driver.findElement(By.name("password"));
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Arjuna@123",Keys.ENTER);
		driver.findElement(By.id("Services")).click();
		driver.findElement(By.id("Extension")).click();
		
		/*List<WebElement> list = driver.findElements(By.xpath("//select[@name='rangeFields[0]']/option"));
		for(WebElement web : list)
		{
			if(web.getText().equals("CAS"))
			{
				web.click();
				break;
			}
			//System.out.println(web.getText());
		}
		driver.findElement(By.name("rangeFields[1]")).sendKeys("*");
		driver.findElement(By.name("onViewRangeButton")).click();*/
		
	
		Select select = new Select(driver.findElement(By.name("rangeFields[0]")));
		List<WebElement> list1 = select.getOptions();
		for(WebElement web1 : list1)
		{
			System.out.println(web1.getText());
		}
		//System.out.println(list1);
		select.selectByVisibleText("CAS");
		driver.findElement(By.name("rangeFields[1]")).sendKeys("*");
		driver.findElement(By.name("onViewRangeButton")).click();
		
		

		
		
	}
}
