package com.bank.qa.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.baseTest.TestBase;

public class HomePage extends TestBase
{
	// Manager userID
	@FindBy(xpath="//td[contains(text(),'Manger Id : mngr180548')]")
	WebElement userid;
	//Manager Button
	@FindBy(xpath="//a[text()='Manager']")
	WebElement Manager;
	//New customer Button
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement New_Customer;
	//Edit customer button
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement Edit_Customer;
	//Delete customer Button
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement Delete_customer;
	//New Account button
	@FindBy(xpath="//a[text()='New Account']")
	WebElement New_account;
	//Edit Account button
	@FindBy(xpath="//a[text()='Edit Account']")
	WebElement Edit_account;
	//Delete Account button
	@FindBy(xpath="//a[text()='Delete Account']")
	WebElement Delete_account;
	//Deposit button
	@FindBy(xpath="//a[text()='Deposit']")
	WebElement Deposit;
	//Withdrawal button
	@FindBy(xpath="//a[text()='Withdrawal']")
	WebElement Withdrawal;
	//Fund_Transfer button
	@FindBy(xpath="//a[text()='Fund Transfer']")
	WebElement Fund_Transfer;
	//Change_password button
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement Change_password;
	//Balance_Enqiry button
	@FindBy(xpath="//a[text()='Balance Enquiry']")
	WebElement Balance_Enqiry;
	//Mini_statment button
	@FindBy(xpath="//a[text()='Mini Statement']")
	WebElement Mini_statment;
	//Cusromer_statement button
	@FindBy(xpath="//a[text()='Customised Statement']")
	WebElement Cusromer_statement;
	//Log_out button
	@FindBy(xpath="//a[text()='Log out']")
	WebElement Log_out;
	
	//Initializing all webElement to webdriver
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	//actions or method performing on web page
	public String verifyManagerId()
	{
		String managertext=userid.getText();
		return managertext;
	}
	public void clickOnMangerTab()
	{
		Manager.click();
	}
	public void clickOnNewcusomerTab()
	{
		New_Customer.click();
	}
	public void editCustomerTab()
	{
		Edit_Customer.click();
	}
	public void deletecustomerTab()
	{
		Delete_customer.click();
	}
	public void newAccountTab()
	{
		New_account.click();
	}
	public void editAccountTab()
	{
		Edit_account.click();
	}
	public void deleteAccountTab()
	{
		Delete_account.click();
	}
	public void depositTab()
	{
		Deposit.click();
	}
	public void withdrawalTab()
	{
		Withdrawal.click();
	}
	public void fundTransferTab()
	{
		Fund_Transfer.click();
	}
	public void changePasswordTab()
	{
		Change_password.click();
	}
	public void balanceEnqiryTab()
	{
		Balance_Enqiry.click();
	}
	public void miniStatmentTab()
	{
		Mini_statment.click();
	}
	public void cusromerStatementTab()
	{
		Cusromer_statement.click();
	}
	public void logOutTab()
	{
		Log_out.click();
	}
	
}
