package selenium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckSortedOrNot 
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
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.get("file:///C:/Users/mallikar/Eclipse-Selenium/Selenium/src/selenium/Drop.html");
		WebDriver.Options options = driver.manage();
		WebDriver.Window window = options.window();
		window.maximize();
		
		ArrayList<String> list1 = new ArrayList<String>();
		Select sel = new Select(driver.findElement(By.id("100")));
		List<WebElement> list = sel.getOptions();
		
		for(WebElement web : list)
		{
			list1.add(web.getText());
		}
		
		ArrayList<String> list2 = new ArrayList<String>(list1);
		
		//sort the list1 contents.
		Collections.sort(list1);
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.equals(list2));
	}
}
