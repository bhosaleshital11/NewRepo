package samplePackage;

import org.testng.annotations.Test;

public class VtigerApp {


	@Test (dependsOnMethods ="SampeTest2")
	public void sampleTest()
	{
		System.out.println("method 1");
	}
	
	@Test
	public void SampeTest2()
	{
		System.out.println("method 2");
	}
		// TODO Auto-generated method stub

	}


