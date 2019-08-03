package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PMLogin 
{	
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
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
		driver.findElement(By.id("myUser_VO.lastName")).sendKeys("Rebel");
		driver.findElement(By.id("myUser_VO.userId"));
		
		
		/*File file = new File("C:\\Users\\mallikar\\Desktop\\MX-ONE\\selenium\\xlsx_Files\\Data.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fs);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println(totalRows);
		//XSSFRow row = sheet.getRow(0);
		//System.out.println(row.getPhysicalNumberOfCells());
		
		for(Row rw : sheet)
		{
			for(Cell cl : rw)
			{
				System.out.print(cl.getStringCellValue());
				System.out.print("\t"+"|");
			}
			System.out.println();
		}
		
		Iterator<Row> iterator = sheet.rowIterator();
		while(iterator.hasNext())
		{
			//System.out.println(iterator.next());
			Iterator<Cell> itr = iterator.next().cellIterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next().getStringCellValue());
				System.out.print("|"+"\t");
			}
			System.out.println();
		}
		
		//write a content to .xlsx file
		XSSFRow rw = sheet.createRow(totalRows);
		rw.createCell(0).setCellValue("Partha");
		rw.createCell(1).setCellValue("Partha@123");
		
		fs.close();
		FileOutputStream fo = new FileOutputStream(file);
		book.write(fo);
		fo.close();*/
		
	}

}
