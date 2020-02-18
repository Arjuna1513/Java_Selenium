package point;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class PointEx1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe"); 
//		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		System.setProperty("webdriver.edge.driver", "./Drivers/MicrosoftWebDriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://pm.mxonebglman.com");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("login"));
		Point point = element.getLocation();
		Thread.sleep(2000);
		int xcord = point.getX();
		int ycord = point.getY();
		System.out.println("Values of x and y valyes are : "+xcord+"  "+ycord);
		Actions action = new Actions(driver);
		action.moveToElement(element, xcord, ycord).click().build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}
}
