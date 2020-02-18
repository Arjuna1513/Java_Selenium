package iTestListenersWithLogging;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggingWithLog4j 
{
	public static Logger Log;
	
	public static Logger getLogReference(String className)
	{
		Log  = Logger.getLogger(className);
		DOMConfigurator.configure("log4j.xml");
		return Log;
	}
	
	public static void closeLog()
	{
		Log.removeAllAppenders();
	}
}
