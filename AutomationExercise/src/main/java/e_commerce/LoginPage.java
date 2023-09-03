package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import e_commerce.repository.Resources;

public class LoginPage extends Resources {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signupLoginBtn;
	@FindBy(xpath = "//h2[contains(text(), 'Login to your account')]")
	private WebElement loginText;
	@FindBy(xpath = "//form[@action='/login']/input[@name='email']")
	private WebElement emailId;
	@FindBy(xpath = "//form[@action='/login']/input[@name='password']")
	private WebElement password;
	@FindBy(css = "button[data-qa='login-button']")
	private WebElement loginBtn;
	@FindBy(xpath = "//a[contains(text(), 'Logged in as')]")
	private WebElement loggedInUsernameText;
	@FindBy(xpath = "//a[@href='/delete_account']")
	private WebElement deleteAccountBtn;
	@FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
	private WebElement accountDeletedText;
	@FindBy(xpath = "//p[contains(text(), 'Your email or password is incorrect!')]")
	private WebElement incorrectEmailPasswordText;
			@FindBy(xpath = "//a[@href='/logout']")
			private WebElement logoutBtn;
//			@FindBy(xpath = "xpath")
//			private WebElement name;
//			@FindBy(xpath = "xpath")
//			private WebElement name;
//			@FindBy(xpath = "xpath")
//			private WebElement name;

	public String verifyHomepage() {
		return driver.getTitle();
	}

	public void openSignupLogin() {
		signupLoginBtn.click();
	}

	public String verifyLoginText() {
		loginText.isDisplayed();
		return loginText.getText();
	}

	public void setEmailId(String emailIdStr) {
		emailId.sendKeys(emailIdStr);
	}

	public void setPassword(String passwordStr) {
		password.sendKeys(passwordStr);
	}

	public void setLoginBtn() {
		loginBtn.click();
	}

	public String verifyLoggedInUsername() {
		loggedInUsernameText.isDisplayed();
		return loggedInUsernameText.getText();
	}

	public void setDelectAccount() {
		deleteAccountBtn.click();
	}

	public String verifyAccountDeleted() {
		accountDeletedText.isDisplayed();
		return accountDeletedText.getText();
	}

	public String verifyIncorrectEmailPassword() {
		incorrectEmailPasswordText.isDisplayed();
		return incorrectEmailPasswordText.getText();

	}
	public void logout() {
		logoutBtn.click();
	}
	public String verifyLoginPage() {
		return driver.getTitle();
	}
	
	

}
