package pages;

import org.openqa.selenium.By;

import base.Base;

public class WelcomePage extends Base{
	public WelcomePage verifyHomePage() {

		String text = driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome"))
		{
			System.out.println("welcome to home page");
		}
		else
		{
			System.out.println("home page not here");
		}
		return this;
	}
	

	public MyHomePage clickCRMFSLink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

	
}
