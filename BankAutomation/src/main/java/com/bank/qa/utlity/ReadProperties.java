package com.bank.qa.utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
	public static Properties prop;
	public ReadProperties()
	{
		try
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("D:\\WorkSpace2\\BankAutomation\\Configuration\\config.properties");
			prop.load(fis);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	//Actions
	public String getApplicationUrl()
	{
		String URL=prop.getProperty("url");
		return URL;
	}
	public String getUserName()
	{
		String username=prop.getProperty("username");
		return username;
	}
	public String getPasword()
	{
		String password=prop.getProperty("password");
		return password;
	}
	public String getBrowserName()
	{
		String browser=prop.getProperty("browser");
		return browser;
	}

}
