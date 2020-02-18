package iTestListenersWithLogging;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerClass implements ITestListener
{
	Logger Log = LoggingWithLog4j.getLogReference("TestListenerClass");
	@Override
	public void onTestStart(ITestResult result) 
	{
//		Logger Log = (Logger) result.getTestContext().getAttribute("Logger");
		Log.info("========Test "+result.getMethod().getMethodName()+" has started");
		Log.info(result.getTestContext().getAttribute("Louda"));
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
//		Logger Log = (Logger) result.getTestContext().getAttribute("Logger");
		Log.info("========Test "+result.getMethod().getMethodName()+" has PASSED successfully");
		Log.info(result.getTestContext().getAttribute("Louda"));
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
//		Logger Log = (Logger) result.getTestContext().getAttribute("Logger");
		System.out.println("Logger Value is :"+Log);
		Log.info("========Test "+result.getMethod().getMethodName()+" has FAILED.");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
//		Logger Log = (Logger) result.getTestContext().getAttribute("Logger");
		Log.info("========Test "+result.getMethod().getMethodName()+" has SKIPPED successfully");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

}
