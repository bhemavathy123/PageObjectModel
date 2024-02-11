package pages;

import org.openqa.selenium.By;

import base.Base;

public class MyHomePage extends Base{
	
	public CreateLeadPage clickLeadsLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();	
		return new CreateLeadPage();
	}

}
