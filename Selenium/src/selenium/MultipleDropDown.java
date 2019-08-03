package selenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown 
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
		driver.get("https://10.211.62.204/mp/");
		WebDriver.Options options = driver.manage();
		WebDriver.Window window = options.window();
		window.maximize();
		driver.findElement(By.name("userId")).sendKeys("Arjuna");
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Arjuna@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("Users")).click();
		driver.findElement(By.id("User")).click();
		driver.findElement(By.name("onAddButton")).click();
		Select sel = new Select(driver.findElement(By.id("mySelectedDepts")));
		List<WebElement> list = sel.getOptions();
		/*for(WebElement web : list)
		{
			web.click();
			Thread.sleep(2000);
		}*/
		for(int i=0; i<list.size(); i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
			//sel.deselectByIndex(i);
		}
		
		sel.deselectByIndex(1);
		sel.deselectByValue("Mitel; CUSTGRP1");
		System.out.println(sel.isMultiple());
	}
}