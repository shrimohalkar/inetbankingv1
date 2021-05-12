package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Loginpage;

public class TC_LoginPage_001 extends BaseClass
{
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{

		
		Loginpage lp=new Loginpage(driver);
		
		lp.setUsername(username);
		logger.info("***  Entered Username  ***");
		
		lp.setPassword(password);
		logger.info("***  Enterd Password  ***");
		
		lp.clickLogin();
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			
			Assert.assertTrue(true);
			logger.info("***  Login test passed  ***");
			lp.clicklogout();
			logger.info("***  Clicked Logout  ***");
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
		}
		else
		{
			caputreScreen(driver , "loginTest");
			Assert.assertTrue(false);
			logger.info("***  Login test failed  ***");
		}
		
	}

}
