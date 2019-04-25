package com.bank.qa.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.qa.baseTest.TestBase;
import com.bank.qa.pageObject.HomePage;
import com.bank.qa.pageObject.LoginPage;

public class HomePageTest extends TestBase
{
	public static HomePage homepage=new HomePage();
	public static  LoginPage loginpage=new LoginPage();
	
    @BeforeMethod
    public void setUp1()
    {
    	loginpage=new LoginPage();
    	loginpage.setUsername(username);
    	loginpage.setPassword(password);
    	loginpage.clickSubmitButton();
    }
	@Test
	public void verfiyMangerAccount()
	{
		homepage=new HomePage();
		String mangerAccount=homepage.verifyManagerId();
		if (mangerAccount.equalsIgnoreCase("Manger Id : mngr180548"))
		{
			System.out.println("manager login to application sucessfully");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("other user login to application");
			Assert.assertFalse(false);
		}
	}
	@AfterMethod
	public void tearDown()
	{
		homepage=new HomePage();
		homepage.logOutTab();
	}

}
