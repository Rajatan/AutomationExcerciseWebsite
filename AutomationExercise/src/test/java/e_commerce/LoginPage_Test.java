package e_commerce;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage_Test extends Ecomm_BaseFile {
	String emailIdStr = "kave@info.com";
	String passwordStr = "kave@123";
	String incorrectEmailIdStr = "incorrect.kave@info.com";
	String incorrectPasswordStr = "incorrect_kave@123";
	String usernameStr = "Kave Tester";

	WebDriver driver;

	@BeforeTest
	public void initBrowser() {
		driver = initDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
	}

//	Test Case 2: Changed
	@Test
	public void loginPage_Test() {

		LoginPage login = new LoginPage(driver);

		login.verifyHomepage();
		login.openSignupLogin();
		assertEquals(login.verifyLoginText().trim(), "Login to your account");
		login.setEmailId(emailIdStr);
		login.setPassword(passwordStr);
		login.setLoginBtn();
		assertEquals(login.verifyLoggedInUsername().trim(), "Logged in as " + usernameStr + "");
		login.setDelectAccount();
		assertEquals(login.verifyAccountDeleted().trim(),"ACCOUNT DELETED!");
	}
	
//	Test case: 3
	@Test
	public void loginPageIncorrectEmailPassword_Test() {
		LoginPage login = new LoginPage(driver);
		login.verifyHomepage();
		login.openSignupLogin();
		assertEquals(login.verifyLoginText().trim(), "Login to your account");
		login.setEmailId(incorrectEmailIdStr);
		login.setPassword(incorrectPasswordStr);
		login.setLoginBtn();
		if(login.verifyIncorrectEmailPassword().equalsIgnoreCase("Your email or password is incorrect!")) {
			throw new NoSuchElementException("Invalid EmailID and Password please try again with valid EmailID and Password: "+driver.getCurrentUrl()+"");
		}
	}
	
//	Test case: 4
	@Test
	public void loginLogout_Test() {
		LoginPage login = new LoginPage(driver);
		login.verifyHomepage();
		login.openSignupLogin();
		assertEquals(login.verifyLoginText().trim(), "Login to your account");
		login.setEmailId(incorrectEmailIdStr);
		login.setPassword(incorrectPasswordStr);
		login.setLoginBtn();
		assertEquals(login.verifyLoggedInUsername().trim(), "Logged in as " + usernameStr + "");
		login.logout();
		assertEquals(login.verifyLoginPage().trim(), "Automation Exercise - Signup / Login");
	}
	

}
