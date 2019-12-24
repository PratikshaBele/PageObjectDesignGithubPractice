package com.mt.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mt.config.Config;
import com.mt.utility.LaunchApp;

public class Loginpage {

	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusernm;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpasswd;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	public void loadloginpage()
	{
		PageFactory.initElements(Config.driver,this);
	}
	public void enterUsernm(String usernm)
	{
		objusernm.sendKeys(usernm);
	}
	public void enterPasswd(String passwd)
	{
		objpasswd.sendKeys(passwd);
	}
	public void clickonlogin()
	{
		objlogin.click();;
	}
	
	public static void main(String[] args) throws IOException {
		LaunchApp lp=new LaunchApp();
		lp.openBrowser("chrome");
		lp.EnterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lp.maximizeBrowser();
		lp.waittillLoginpageLoaded(15);
		
		Loginpage lg=new Loginpage();
		lg.loadloginpage();
		lg.enterUsernm("Pratiksha2Bele");
		lg.enterPasswd("nidhi@#");
		lg.clickonlogin();
	
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

