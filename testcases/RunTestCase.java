package testcases;

import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;

public class RunTestCase extends Base{
	
	@Test
	public void runLogin()
	{
		LoginPage lp=new LoginPage();
		lp.enterUserName()
		.enterPwd()
		.clickLogin()
		
		.verifyHomePage()
		.clickCRMFSLink()
		
		.clickLeadsLink()
		
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickSubmitButton()
		
		.verifyLeads();
				
	}

}
