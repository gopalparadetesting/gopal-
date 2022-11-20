package com.hrms.utility;
 import org.apache.log4j.Logger;
public class Log {
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void info(String massage)
	{
		Log.info(massage);
	}
	public static void error(String message) 
	{
		Log.error(message);
	}
	

}
