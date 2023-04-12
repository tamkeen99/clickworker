package com.clickwork.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver d;//allowing access to this entire class
	
	
	@FindBy(xpath="//span[.='Login']")
	private WebElement loginButton;

	@FindBy(id="menu-item-61771")
	private WebElement loginForClickWorkers;
	
	@FindBy(xpath="//span[.='Register']")
	private WebElement registerbutton;
	
	@FindBy(xpath="//li[@id='menu-item-61774']//a[@title='For Clickworkers']")
	private WebElement registerForClickWorkers;
		
	@FindBy(xpath="//button[text()='Accept All']")
	private WebElement acceptAll;
	
	public HomePage(WebDriver driver) {
		d = driver;
		PageFactory.initElements(d, this);
	}
	
	public void setAcceptAll() {
		acceptAll.click();
	}
	public void setRegisterButton() {
		Actions a1 = new Actions(d);
		a1.moveToElement(registerbutton).perform();
	}
	
	public void setForClickWorkers()	{
		registerForClickWorkers.click();
	}
	
	
	public void setLogin() {
		Actions a2=new Actions(d);
		a2.moveToElement(loginButton).perform();
	}
	
	public void setLoignForClickWorkers()	{
		loginForClickWorkers.click();
	}
	
}
