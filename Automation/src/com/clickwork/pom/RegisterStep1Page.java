package com.clickwork.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterStep1Page {

	///Declaration starts
	@FindBy(id="user_gender")
	private WebElement gender;  	//declering gender dropdown
	
	@FindBy(id="user_title")
	private WebElement title;	//declering title web element
	
	@FindBy(id="user_first_name")
	private WebElement firstname; 		//declering firstname web element
	
	@FindBy(id="user_last_name")
	private WebElement lastname;
	
	@FindBy(id="user_username")
	private WebElement username;
	
	@FindBy(id="user_email")
	private WebElement email;
	
	@FindBy(name="user[password]")
	private WebElement password;
	
	@FindBy(id="user_password_confirmation")
	private WebElement confirmPassword;
	
	@FindBy(linkText = "Continue")
	private WebElement continueButton;
	
	//Declaration ends
	
	public RegisterStep1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization starts
	
	public void setGender() {
		Select gen = new Select(gender);
		gen.selectByIndex(1);
	}
	
	public void setTitle(String t) {
		title.sendKeys(t);		
	}
	
	public void setFirtName(String fn) {
		firstname.sendKeys(fn);
	}

	public void setlastName(String ln) {
		lastname.sendKeys(ln);
	}
	
	public void setuserName(String un) {
		username.sendKeys(un);
	}

	public void setEmail(String em) {
		email.sendKeys(em);
	}	
	
	public void setPassword(String pw) {
		password.sendKeys(pw);
	}
	
	
	public void setConfirmPassword(String cp) {
		confirmPassword.sendKeys(cp);
		
	}
	
	public void setContinueButton() {
		continueButton.click();
	}
	
	
	
	}
	
	
	






