package samplePackage;

import org.testng.annotations.Test;
import com.Vtiger.BaseClassUtility.BaseClassUtility;
import com.Vtiger.OrgModule.Utilities.OrgPageOR;

public class CreateOrgTest extends BaseClassUtility {
	@Test
	public void createOrgTest()
	{
		OrgPageOR or=new OrgPageOR(driver);

		or.org.click();
		or.add.click();
		or.accfield.sendKeys("abcd");
		or.savebtn.click();
		
			}
	
}
