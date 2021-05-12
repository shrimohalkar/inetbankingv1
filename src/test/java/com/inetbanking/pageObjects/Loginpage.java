package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
		WebDriver ldriver;
		
		public Loginpage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		
		@FindBy(name="uid")
		@CacheLookup
		WebElement txtUserName;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(name="btnLogin")
		@CacheLookup
		WebElement btnLogin;
		
		@FindBy(xpath="//a[contains(text(),'Log out')]")
		@CacheLookup
		WebElement logout;
		
		public void  setUsername(String uname)
		{
			txtUserName.sendKeys(uname);
			
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
			
		}
		
		public void clickLogin()
		{
			btnLogin.click();
			
		}
		
		public void  clicklogout()
		{
			logout.click();
			
		}
		
	}

