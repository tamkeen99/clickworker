package com.clickwork.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	
	@FindBy(id="password")
	 private WebElement password;
	 
	@FindBy(id="recaptcha-anchor")
	private WebElement capcha;
	
	
	@FindBy(name = "commit")
	private WebElement loginButton;
	
	//constructor
	public LoginPage(WebDriver driver)	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		username.sendKeys(un);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void setCapcha() {
		
		capcha.click();
	}
	
	public void setLoginButton() {
		loginButton.click();
	}
}
