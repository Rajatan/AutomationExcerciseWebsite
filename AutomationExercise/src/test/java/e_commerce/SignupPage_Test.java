package e_commerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SignupPage_Test extends Ecomm_BaseFile {
	WebDriver driver;

	@BeforeTest
	public void initBrowser() {
		driver = initDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
	}

	@Test
	public void signupPage_Test() throws InterruptedException {
		String emailAddress = "fave1@fave.com", fname = "fave1", lname = "Last Fave1", companyName = "Fave Company",
				address1 = "Fave Address 1", address2 = "Fave Address 2", countryName = "USA", stateName = "Karna",
				cityName = "Fave City", zip = "321654", mobile = "1234567890";
		String homeTitle = driver.getTitle();
		Assert.assertEquals(homeTitle, "Automation Exercise");
		SignupPage signup = new SignupPage(driver);

		signup.setSignupLogin();
		Assert.assertEquals(signup.getNewUserSignup(), "New User Signup!");
		signup.setName(fname);
		signup.setEmailAddress(emailAddress);
		signup.setSignup();
		Assert.assertEquals(signup.getEnterAccountInformation(), "ENTER ACCOUNT INFORMATION");
		signup.setTitle();
		signup.setPassword();
		signup.setDay();
		signup.setMonth();
		signup.setYear();
//	Scroll web page vertically 
		signup.scrollBySize(driver, 500);
		signup.setNewsletter();
		signup.setOffer();
		signup.setFirstname(fname);
		signup.setLastname(lname);
		signup.setCompanyname(companyName);
		signup.setAddress_1(address1);
		signup.setAddress_2(address2);
		signup.setCountry(countryName);
		signup.setState(stateName);
		signup.setCity(cityName);
		signup.setZipcode(zip);
		signup.setMobileNumber(mobile);
//		Scroll web page vertically 
		signup.scrollBySize(driver, 200);
		signup.setCreateAccount();
		signup.verifyAccountCreated();
		signup.setContinue();
		signup.verifyLoggedInUser();
		signup.setDeleteAccount();
		signup.verifyAccountDeleted();
		signup.setContinue();

	}

}
