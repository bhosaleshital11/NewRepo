package com.Vtiger.OrgModule.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	Connection con=null;
	
	public void getDbConnection(String url, String username, String password) throws SQLException
	{
	try {
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	FileUtility fu=new FileUtility();
		 con = DriverManager.getConnection(fu.getDataFromProperties("dburl"), fu.getDataFromProperties("dbusername"), fu.getDataFromProperties("dbpassword"));
		}
		catch (Exception e) {
		}
	}
	
	public ResultSet executeQuery(String query) throws SQLException
	{
		ResultSet result=null;
		try {
		 result = con.createStatement().executeQuery(query);
		}
		catch (Exception e) {
			// TODO: handle exception
		}

		return result;
	}
	
	public int executeUpdate(String query) 
	{ 
		int resultdata=0;
		try {
		 resultdata = con.createStatement().executeUpdate(query);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return resultdata;

		
		
	}
	
	public void getConnectionClose() throws SQLException
	{
	try {
		con.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
}

