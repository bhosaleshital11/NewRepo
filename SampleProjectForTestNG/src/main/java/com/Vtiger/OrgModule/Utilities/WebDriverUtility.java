package com.Vtiger.OrgModule.Utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public WebDriver driver=null;
	public WebDriverUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	public void getMaximize()
	{
		driver.manage().window().maximize();
	}
	
	public void getImplicitlyWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	public void getExplicitlyWait()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	public void getSelectByValue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void getSelectByIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}	
}
