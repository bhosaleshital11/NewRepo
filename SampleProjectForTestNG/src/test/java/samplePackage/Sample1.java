package samplePackage;
import org.testng.annotations.Test;

import com.Vtiger.BaseClassUtility.BaseClassUtility;

public class Sample1 extends BaseClassUtility
{

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
	@Test
	public void SampeTest3()
	{
		System.out.println("method 2");
	}
	
}
