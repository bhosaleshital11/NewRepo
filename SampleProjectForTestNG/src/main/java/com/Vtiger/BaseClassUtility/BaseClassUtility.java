package com.Vtiger.BaseClassUtility;

import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Vtiger.OrgModule.Utilities.DatabaseUtility;
import com.Vtiger.OrgModule.Utilities.FileUtility;
import com.Vtiger.OrgModule.Utilities.LoginPageOR;
import com.Vtiger.OrgModule.Utilities.WebDriverUtility;

public class BaseClassUtility{
	public WebDriver driver=null;
	DatabaseUtility db=new DatabaseUtility();
	FileUtility fu=new FileUtility();
	LoginPageOR lp=null;
	@BeforeSuite
//	public void beforeSuite() throws SQLException
//	{
//		System.out.println("=====before suite====");
//		db.getDbConnection("", "root", "root");
//	}
	
		@BeforeClass
	public void beforeClass() throws IOException
	{
		System.out.println("=====before class======");
		String brows = fu.getDataFromProperties("browser");
		
		
		if(brows.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (brows.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
	}
	
		
		
	@BeforeMethod
	public void beforeMethod() throws IOException
	{   
		driver.get(fu.getDataFromProperties("url"));
	WebDriverUtility wu=new WebDriverUtility(driver);
		wu.getMaximize();
	     wu.getImplicitlyWait();
		System.out.println("======before method======");
		lp=new LoginPageOR(driver);

		lp.getLoginToApp();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("=========after method======");
		lp.GetLogOut();
	}
	

	@AfterClass
	public void afterClass()
	{
		System.out.println("=======after class====");
		driver.close();
	}
	
	
//	@AfterSuite
//	public void afterSuite() throws SQLException
//	{
//		System.out.println("====after suite======");
//		db.getConnectionClose();
//	}
}
