package com.inetbanking.testCases;

import java.io.IOException;


import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomerPage;
import com.inetbanking.pageObjects.Loginpage;

public class TC_AddCustomer_003 extends BaseClass
{
	@Test 
	public void AddNewCustomer() throws InterruptedException, IOException
	{
		
		Loginpage lp=new Loginpage(driver);
		
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		logger.info("***  Logged in succesfully  ***");
		Thread.sleep(3000);
		
		AddNewCustomerPage addcust=new AddNewCustomerPage(driver);
		logger.info("***  adding new customer  ***");
		
		addcust.clickaddnewcustomer();
		addcust.custname("Shriram");
		addcust.custgender("male");
		addcust.custdob("21", "09", "1990");
		
		Thread.sleep(3000);
		
		addcust.custaddress("india");
		addcust.custcity("Mumbai");
		addcust.custstate("MH");
		addcust.custpinno(411033);
		addcust.custtelephone("8748787765");
		
		logger.info("***  Entering customer details  ***");
		
		String email= randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("rt45frt");
		addcust.clicksubmit();
		logger.info("***  submited form  ***");
		
		Thread.sleep(6000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("***  creted new customer  ***");
			logger.info("***  Test passed  ***");
		}
		else
		{	
			caputreScreen(driver, "AddNewCustomer");
			Assert.assertTrue(false);
			logger.info("***  unable to creat new customer somthing wrong  ***");
			logger.info("***  Test failed  ***");
		}
	}
	
	
}
