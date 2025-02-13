package com.Vtiger.OrgModule.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class FileUtility {
	
	
		public String getDataFromProperties(String key) throws IOException
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\afzau\\git\\repository\\VtigerApp\\ConfigureApp\\commondataforVtigerApp.properties");
			Properties pobj=new Properties();
			pobj.load(fis);
			String data=pobj.getProperty(key);
			return data;
		}

}
