package e_commerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import e_commerce.repository.Resources;

public class SignupPage extends Resources {

	WebDriver driver;

	SignupPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signupLoginBtn;
	@FindBy(xpath = "//h2[contains(text(), 'New User Signup!')]")
	private WebElement newUserSignupTxt;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement nameTxtbox;
	@FindBy(xpath = "//form[@action='/signup']/input[@name='email']")
	private WebElement emailAddressTxtbox;
	@FindBy(xpath = "//form[@action='/signup']/button[@class='btn btn-default']")
	private WebElement signupBtn;
	@FindBy(xpath = "//b[contains(text(), 'Enter Account Information')]")
	private WebElement enterAccountInformationTxt;
	@FindBy(id = "id_gender1")
	private WebElement titleBtn;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTxtbox;

	public void setSignupLogin() {
		signupLoginBtn.click();
	}

	public String getNewUserSignup() {
		System.out.println("The New User Signup! is visible: " + newUserSignupTxt.isDisplayed());
		return newUserSignupTxt.getText().trim();
	}

	public void setName(String fname) {
		nameTxtbox.sendKeys(fname);
	}

	public void setEmailAddress(String emailAddress) {
		emailAddressTxtbox.sendKeys(emailAddress);
	}

	public void setSignup() {
		signupBtn.click();
	}

	public String getEnterAccountInformation() {
		System.out.println("The ENTER ACCOUNT INFORMATION is visible: " + enterAccountInformationTxt.isDisplayed());
		return enterAccountInformationTxt.getText();
	}

	public void setTitle() {
		titleBtn.click();
	}

	public void setPassword() {
		passwordTxtbox.sendKeys("abc@123");
	}

	@FindBy(xpath = "//select[@id='days']")
	private WebElement dayDropdown;
	@FindBy(xpath = "//select[@id='months']")
	private WebElement monthDropdown;
	@FindBy(xpath = "//select[@id='years']")
	private WebElement yearDropdown;
	@FindBy(id = "newsletter")
	private WebElement newsletterCheckbox;
	@FindBy(id = "optin")
	private WebElement offerCheckbox;

	public void setDay() {
		selectByValues(dayDropdown, "11");
	}

	public void setMonth() {
		selectByValues(monthDropdown, "3");
	}

	public void setYear() {
		selectByValues(yearDropdown, "1997");
	}

	public void setNewsletter() {
		newsletterCheckbox.click();
	}

	public void setOffer() {
		offerCheckbox.click();
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;
	@FindBy(id = "address1")
	private WebElement address_1;
	@FindBy(id = "address2")
	private WebElement address_2;
	@FindBy(xpath = "//select[@name='country']")
	private WebElement country;
	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;

	public void setFirstname(String fname) {
		firstname.sendKeys(fname);
	}

	public void setLastname(String lname) {
		lastname.sendKeys(lname);
	}

	public void setCompanyname(String companyName) {
		company.sendKeys(companyName);
	}

	public void setAddress_1(String address1) {
		address_1.sendKeys(address1);
	}

	public void setAddress_2(String address2) {
		address_2.sendKeys(address2);
	}

	public void setCountry(String countryName) { // value: India
		country.sendKeys(countryName);
	}

	public void setState(String stateName) { // Karnataka
		state.sendKeys(stateName);
	}

	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;
	@FindBy(xpath = "//input[@name='zipcode']")
	private WebElement zipcode;
	@FindBy(xpath = "//input[@name='mobile_number']")
	private WebElement mobileNumber;
	@FindBy(xpath = "//button[contains(text(), 'Create Account')]")
	private WebElement createAccountBtn;
	@FindBy(xpath = "//b[contains(text(), 'Account Created')]")
	private WebElement accountCreatedText;
	@FindBy(xpath = "//a[@data-qa='continue-button']")
	private WebElement continueBtn;

	@FindBy(xpath = "//a[contains(text(), 'Logged in as')]")
	private WebElement verifyLoggedInUserText;

	public void setCity(String cityName) {
		city.sendKeys(cityName);
	}

	public void setZipcode(String zip) {
		zipcode.sendKeys(zip);
	}

	public void setMobileNumber(String mobile) {
		mobileNumber.sendKeys(mobile);
	}

	public void setCreateAccount() {
		createAccountBtn.click();
	}

	public void verifyAccountCreated() {
		accountCreatedText.isDisplayed();
	}

	public void setContinue() {
		continueBtn.click();
	}

	public void verifyLoggedInUser() {
		verifyLoggedInUserText.isDisplayed();
	}

	@FindBy(xpath = "//a[@href='/delete_account']")
	private WebElement deleteAccountBtn;
	@FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
	private WebElement accountDeletedText;
	@FindBy(xpath = "//p[contains(text(), 'Email Address already exist!')]")
	private WebElement verifyUserExistText;

	public void setDeleteAccount() {
		deleteAccountBtn.click();
	}

	public void verifyAccountDeleted() {
		accountDeletedText.isDisplayed();
	}

	public String verifyUserExist() {
		verifyUserExistText.isDisplayed();
		return verifyUserExistText.getText();
	}
}
