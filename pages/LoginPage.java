package pages;

import org.openqa.selenium.By;

import base.Base;

public class LoginPage extends Base {

	public LoginPage enterUserName()
	{
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	public LoginPage enterPwd()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
