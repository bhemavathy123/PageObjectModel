package pages;

import org.openqa.selenium.By;

import base.Base;

public class CreateLeadPage extends Base{
	
	public CreateLeadPage enterCompanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ORACLE");
		return this;
		
	}

	public CreateLeadPage enterFirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hemavathy");
		return this;
	}
	
	public CreateLeadPage enterLastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("balakrishnan");
		return this;
	}
	
	public VerifyLeadPage clickSubmitButton()
	{
	driver.findElement(By.name("submitButton")).click();
	return new VerifyLeadPage();
}
}
