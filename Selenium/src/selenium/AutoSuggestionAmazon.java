package selenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestionAmazon 
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
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricket");
		//List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion']/span"));
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']//div[@class='s-suggestion']"));
		
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("cricket bats"))
			{
				ele.click();
				break;
			}
		}
		
	}
}
