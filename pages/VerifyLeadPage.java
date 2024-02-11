package pages;

import org.openqa.selenium.By;

import base.Base;

public class VerifyLeadPage extends Base{
	
	public MyLeadsPage verifyLeads()
	{
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[4]")).click();
		return new MyLeadsPage();
	}

}
