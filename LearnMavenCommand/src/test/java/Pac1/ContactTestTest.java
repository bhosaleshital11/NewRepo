package Pac1;

import org.testng.annotations.Test;

public class ContactTestTest {

  @Test(groups="smokeTest")
  public void createContactTestTest() {
	  String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createNewContactTest");  }

  @Test(groups="RegressionTest")
  public void modifyContactTestTest() {
	  
    throw new RuntimeException("Test not implemented");
  }
}
