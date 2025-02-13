package com.Vtiger.OrgModule.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	
	public int getRowCount(String path,String sheetname) throws IOException
	{
		FileInputStream fisExcel= new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fisExcel);
		Sheet sheet = workbook.getSheet(sheetname);
		int rowCount=sheet.getLastRowNum();
		return rowCount;
	}
	
	
	
	
}
