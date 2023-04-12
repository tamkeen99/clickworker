package tam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.clickwork.generic.BaseClass;
import com.clickwork.generic.FileLib;
import com.clickwork.pom.HomePage;
import com.clickwork.pom.RegisterStep1Page;
import com.clickwork.pom.RegisterStep2Page;
import com.clickwork.pom.RegisterStep3Page;


@Listeners(com.clickwork.generic.ListenerImplementation.class)


class RegisterExecute extends BaseClass  {

	
		
		@Test
		public void registration() throws IOException {
		HomePage h1 = new HomePage(driver);
	
		//HomePage
		h1.setAcceptAll();

		h1.setRegisterButton();
		
		h1.setForClickWorkers();
		
		//RegisterStep1Page starts
		Set<String> win = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(win);
		driver.switchTo().window(al.get(1));
	
		
		FileLib f=new FileLib();
		
		String title = f.getProperty("title");
		String fname =f.getProperty("fname");
		String lname =f.getProperty("lname");
		String uname =f.getProperty("uname");
		String email =f.getProperty("email");
		String pass =f.getProperty("pass");
	

		RegisterStep1Page r1 = new RegisterStep1Page(driver);
		r1.setGender();
        r1.setTitle(title);
		r1.setFirtName(fname);
		r1.setlastName(lname);
		r1.setuserName(uname);
		r1.setEmail(email);
		r1.setPassword(pass);
		r1.setConfirmPassword(pass);
		r1.setContinueButton();
		//RegisterStep1Page ends		
		
		//RegisterStep2Page starts
		
		
		
		String dob =f.getProperty("dob");
		String street=f.getProperty("street");
		String pcode=f.getProperty("postalCode");
		String city=f.getProperty("city");
		String phone= f.getProperty("phone");
		
		
		RegisterStep2Page r2=new RegisterStep2Page(driver);
		r2.setDob(dob);
		r2.setCountry();
		r2.setNativeLanguage();
		r2.setStreet(street);
		r2.setZipCode(pcode);
		r2.setCity(city);
		r2.setPcode();
		r2.setPnum(phone);
		r2.setCbox();
		r2.setGbox();
		r2.setGbox2();
		r2.setContinueButton();
		
	//RegistrationPage2ends
		
		//RegistrationPage3
		RegisterStep3Page r3=new RegisterStep3Page(driver);
		
		
		r3.setg3box();
		r3.setfinishbutton();
		
	}
}
