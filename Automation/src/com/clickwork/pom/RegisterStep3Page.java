package com.clickwork.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterStep3Page {
	
	@FindBy(className = "form-check-label")
	private WebElement g3box;
	
	
	@FindBy(id="submitUserRegistrationButton")
	private WebElement finishButton;
	
	
	public RegisterStep3Page(WebDriver driver)	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setg3box () {
		g3box.click();
	}
	public void setfinishbutton() {
		finishButton.click();
	}
	
	
}
