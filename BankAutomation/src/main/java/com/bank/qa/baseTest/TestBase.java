package com.bank.qa.baseTest;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.bank.qa.utlity.ReadProperties;
import com.google.common.io.Files;

public class TestBase
{
	public static ReadProperties readproperties=new ReadProperties();
	public static String browsername=readproperties.getBrowserName();
	public static String username=readproperties.getUserName();
	public static String password=readproperties.getPasword();
	public static String baseUrl=readproperties.getApplicationUrl();
	public static WebDriver driver;
   public static final Logger logger=Logger.getLogger(TestBase.class.getName());
	@BeforeTest
	public static void loadlog4j()
	{
	String	log4jpath=System.getProperty("user.dir")+"\\log4j.properties";
	PropertyConfigurator.configure(log4jpath);
	}
	
	@BeforeClass
	@Parameters("browser")
	public static void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace2\\BankAutomation\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace2\\BankAutomation\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(baseUrl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void setDown()
	{
		driver.close();
	}
	public static void implicitlyWait(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void pageloadTimeOut(long time)
	{
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
	public static void getScreenshot(String testMethodname) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("D:\\WorkSpace2\\BankAutomation\\ScreenShot\\"+testMethodname+"_"+".jpg"));
	}

}
