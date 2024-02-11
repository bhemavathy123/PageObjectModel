package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class MyLeadsPage extends Base{

	public CreateLeadPage clickCreateLeadLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
		
	}
	/*public void clickFindLeadsLink()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	public void clickMergeLeadsLink()
	{
		driver.findElement(By.linkText("Merge Leads")).click();	
	}*/
}
