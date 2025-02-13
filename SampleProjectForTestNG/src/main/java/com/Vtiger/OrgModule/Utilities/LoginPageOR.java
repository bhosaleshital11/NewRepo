package com.Vtiger.OrgModule.Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOR {

	WebDriver driver=null;

	public LoginPageOR(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
    public 	WebElement username;
	
	@FindBy(name="user_password")
	public WebElement password;
	
	@FindBy(id="submitButton")
	public WebElement loginbtn;
	
	@FindBy(xpath="//img[@border='0'and  @style='padding: 0px;padding-left:5px']")
	public WebElement admin;
	
	@FindBy(linkText  ="Sign Out")
	public WebElement signout;
	
	public void getLoginToApp() throws IOException
	{
		FileUtility fu=new FileUtility();
		username.sendKeys("admin");
		password.sendKeys("admin");
		loginbtn.click();
		
	}
	
	public void GetLogOut()
	{
	Actions act=new Actions(driver);
	act.moveToElement(admin).perform();
	signout.click();
		
	}
}
