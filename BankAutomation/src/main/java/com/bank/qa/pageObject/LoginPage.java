package com.bank.qa.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.baseTest.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//input[@type='reset']")
	WebElement reSetButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void setUsername(String username1)
	{
		username.sendKeys(username1);
	}
	public void setPassword(String password1)
	{
		password.sendKeys(password1);
	}
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public void clickReSetbutton()
	{
		reSetButton.click();
	}
	public String getPageTittle()
	{
		String tittle=driver.getTitle();
		return tittle;
	}
}
