package Pac2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="RegressionTest")
	public void createOrgTest()
	{
		System.out.println("execute createContactTest");
		
	}
	@Test(groups="smokeTest")
	public void modifyOrgTest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createNewContactTest");
		System.out.println("execute modifyContactTest");
		
	}
}
