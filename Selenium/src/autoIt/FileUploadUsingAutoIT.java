package autoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadUsingAutoIT 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
	/*	WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(),'Help')]"))));*/
		driver.findElement(By.xpath("(//div[@class='popup_menu_button popup_menu_button_addons']/../../following-sibling::div)[1]")).click();
		//(//div[@class='popup_menu_button popup_menu_button_addons']/../../following-sibling::div)[1]
		////div[@class='popup_menu_button popup_menu_button_support']
		Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		
		//driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
		driver.findElement(By.linkText("Contact actiTIME Support")).click();
		Thread.sleep(2000);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Drag and drop file here or click to upload']")));
		driver.findElement(By.xpath("//span[.='Drag and drop file here or click to upload']")).click();
		Thread.sleep(2000);
	
		Runtime.getRuntime().exec("C:\\Users\\mallikar\\Desktop\\uploadfile.exe");
		Thread.sleep(5000);
	}
}
