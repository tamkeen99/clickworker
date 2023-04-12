package com.clickwork.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterStep2Page {

	@FindBy(id="user_date_of_birth")
	private WebElement dob;
	  
	
	@FindBy(id="user_address_country")
	private WebElement contry;
	
	
	@FindBy(id="user_native_languages")
	private WebElement language;
	 
	@FindBy(id="user_address_street")
private WebElement street;	
	
	@FindBy(id="user_address_postal_code")
	private WebElement zipcode;
	
	@FindBy(id="user_address_city")
	private WebElement city;
	
	@FindBy(id="user_address_phone_code")
	private WebElement pcode;
	
	@FindBy(id="user_address_phone_number")
	private WebElement pnum;
	
	
	 @FindBy(xpath="//label[@for='user_agreements_is_full_age']")
	 private WebElement cbox;
	 
	 @FindBy(xpath = "//label[@for='user_agreements_general_10123']")
	 private WebElement gbox;
	 
	 @FindBy(xpath = "//label[@for='user_agreements_general_10124']")
	 private WebElement g2box;
	 
	 @FindBy(id="cw-registration-second-step-next-btn")
	 private WebElement continueButton;
	 
	 //decleratin ends
	
public RegisterStep2Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setDob(String dab) {
	dob.sendKeys(dab);

}



	public void setCountry() {
		Select con=new Select(contry);
		con.selectByValue("in");
	}
	public void setNativeLanguage() {
		Select lan=new Select(language);
		lan.selectByValue("en-gb");
		lan.selectByValue("en-us");
		}
	public void setStreet(String street) {
			this.street.sendKeys(street);
	}
	public void setZipCode(String zipcode)	{
		this.zipcode.sendKeys(zipcode);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	public void setPcode(){
	         Select cod=new Select(pcode);
	         cod.selectByVisibleText("+91");
	}
	
	public void setPnum(String pnum){
		this.pnum.sendKeys(pnum);
	}
	
	public void setCbox(){
		cbox.click();
	}
	
	
	public void setGbox() {
		gbox.click();
	}
	
	public void setGbox2() {
		g2box.click();
	}
	public void setContinueButton() {
		continueButton.click();
	}
	


	
}

	