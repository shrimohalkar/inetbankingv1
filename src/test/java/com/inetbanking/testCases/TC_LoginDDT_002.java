package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Loginpage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {

	
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException, IOException
	{
		
		Loginpage lp=new Loginpage(driver);
		
		lp.setUsername(user);
		logger.info("***  Entered Username  ***");
		
		lp.setPassword(pwd);
		logger.info("***  Enterd Password  ***");
		
		lp.clickLogin();
		
		if(isAlertPresent()==true)
		{
			caputreScreen(driver , "TC_LoginDDT_002");
			driver.switchTo().alert().accept();  // closing alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.info("***  Login test Failed  ***");
			
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("***  Login test Passed  ***");
			lp.clicklogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	
	public boolean isAlertPresent() // User defined method created for alert present or not
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/logindata.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
		return logindata;
	}
}
