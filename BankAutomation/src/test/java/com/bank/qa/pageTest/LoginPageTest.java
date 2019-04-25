package com.bank.qa.pageTest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.qa.baseTest.TestBase;
import com.bank.qa.pageObject.LoginPage;

public class LoginPageTest extends TestBase
{
	private static final Logger logger=Logger.getLogger(LoginPageTest.class.getName());
	public static LoginPage loginpage=new LoginPage();
  @Test(priority=1)
  public void getPageTittle()
  {
	  String pageTittle=loginpage.getPageTittle();
	  logger.info("started execution");
	  Assert.assertEquals(pageTittle, "Guru99 Bank Home Page");
	  logger.info("verify the assertion message");
  }
  @Test(priority=2)
  public void loginIntoApplication()
  {
	  logger.info("started login to application");
	  loginpage=new LoginPage();
	  loginpage.setUsername(username);
	  loginpage.setPassword(password);
	  loginpage.clickSubmitButton();
	  logger.info("not able to login into application");
  }
}
