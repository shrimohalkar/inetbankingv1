package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	WebDriver ldriver;
	
	public AddNewCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement lnkaddnewcustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement custname;
	
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement rdgender;
	
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement txtdob;
	
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement txtstate;
	
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement txtpinno;
	
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement txttelephoneno;
	
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtemailid; 
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword; 
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement txtsubmit; 
	
	
	public void  clickaddnewcustomer()
	{
		lnkaddnewcustomer.click();
		
	}
	
	public void  custname(String cname)
	{
		custname.sendKeys(cname);;
		
	}
	
	public void  custgender(String cgender)
	{
		rdgender.click();
		
	}
	
	public void  custdob(String mm,String dd,String yy )
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}
	
	public void  custaddress(String caddress)
	{
		txtaddress.sendKeys(caddress);;
		
	}
	
	public void  custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
		
	}
	
	public void  custstate(String cstate)
	{
		txtstate.sendKeys(cstate);
		
	}
	
	public void  custpinno(int cpin)
	{
		txtpinno.sendKeys(String.valueOf(cpin));
		
	}
	
	public void  custtelephone(String ctele)
	{
		txttelephoneno.sendKeys(ctele);
		
	}
	
	public void custemailid(String cemail)
	{
		txtemailid.sendKeys(cemail);
		
	}
	
	
	public void custpassword(String cpass)
	{
		txtpassword.sendKeys(cpass); 
		
	}
	
	public void clicksubmit()
	{
		txtsubmit.click();
		
	}
	
	
}
