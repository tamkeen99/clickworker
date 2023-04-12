package tam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.clickwork.pom.LoginPage;
import com.clickwork.pom.HomePage;



public class LoginExecute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.clickworker.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage h2 = new HomePage(driver);
		
		h2.setAcceptAll();
		h2.setLogin();
		h2.setLoignForClickWorkers();
		
		
		Set<String> win = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(win);
		driver.switchTo().window(al.get(1));
		
		LoginPage l = new LoginPage(driver);
		
		FileInputStream fis = new FileInputStream("./clickworkdata/clickWorkerData.property");
		Properties p = new Properties();
		p.load(fis);
		
		String un = p.getProperty("uname");
		String pw=p.getProperty("pass");
		
		l.setUsername(un);
l.setPassword(pw);
l.setCapcha();
l.setLoginButton();
	}

}
