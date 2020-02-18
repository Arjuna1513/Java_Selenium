package iTestListenersWithLogging;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(iTestListenersWithLogging.TestListenerClass.class)
public class TestMethods extends TestListenerClass
{
	Logger Log = LoggingWithLog4j.getLogReference("TestMethods");
	
	@BeforeSuite
	public void setUp(ITestContext context) throws IOException
	{
		context.setAttribute("Louda", "Lassi");
//		File file = new File("C://Users//Mallikarjuna//git//Java_Selenium//Selenium//MyLogs.log");
		File file = new File("seleniumLogs.log");
		FileWriter fr = new FileWriter(file);
//		fr.write("Writing the content to File");
		fr.flush();
		
		if(file.exists())
		{
			fr.close();
			System.out.println("Deleting the File");
//			file.delete();
		}
//		file.delete();
		
		try {
		    Runtime.getRuntime().exec("taskkill /F /IM chromeDriver.exe");
		    Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
		    Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
		} catch (IOException e) 
		{
		    e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void tearDown() throws IOException
	{
		/*File file = new File("seleniumLogs.log");
		FileWriter fr = new FileWriter(file);
//		fr.write("Writing the content to File");
//		fr.flush();
		
		if(file.exists())
		{
//			fr.close();
			System.out.println("Deleting the File");
//			file.delete();
		}*/
	}
	@Test
	public void method1(ITestContext context)
	{
		context.setAttribute("Logger", Log);
		context.setAttribute("Name", "Mallikarjuna");
		Log.info("Method 1");
	}
	
	@Test
	public void method2(ITestContext context)
	{
		Log.info("Method 2");
		Log.info(context.getAttribute("Name"));
	}
	
	@Test
	public void method3(ITestContext context)
	{
		Log.info("Method 3");
		Log.info(context.getAttribute("Name"));
	}
	
	@Test
	public void method4(ITestContext context)
	{
		Log.info("Method 4");
		Log.info(context.getAttribute("Name"));
	}
	
	@Test
	public void method5(ITestContext context)
	{
		Log.info("Method 5");
		Log.info(context.getAttribute("Name"));
	}
}
