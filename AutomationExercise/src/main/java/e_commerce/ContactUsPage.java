package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import e_commerce.repository.Resources;

public class ContactUsPage extends Resources {
	WebDriver driver;

	/**
	 * @param driver
	 */
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//a[@href='/contact_us']")
	private WebElement contactUsBtn;
	@FindBy(xpath = "//h2[contains(text(), 'Get In Touch')]")
	private WebElement getInTouchText;
	@FindBy(css = "input[name='name']")
	private WebElement nameTextbox;
	@FindBy(css = "input[name='email']")
	private WebElement emailTextbox;
	@FindBy(css = "input[name='subject']")
	private WebElement subjectTextbox;
	@FindBy(id = "message")
	private WebElement messageTextbox;
	@FindBy(xpath = "input[name='upload_file']")
	private WebElement uploadFile;

	public String verifyHomepage() {
		return driver.getTitle();
	}

	public void openContactUsPage() {
		contactUsBtn.click();
	}

	public String verifyGetInTouch() {
		getInTouchText.isDisplayed();
		return getInTouchText.getText();
	}

	public void setName(String nameStr) {
		nameTextbox.sendKeys(nameStr);
	}

	public void setEmail(String emailStr) {
		emailTextbox.sendKeys(emailStr);
	}

	public void setSubject(String subjectStr) {
		subjectTextbox.sendKeys(subjectStr);
	}

	public void setMessage(String messageStr) {
		messageTextbox.sendKeys(messageStr);
	}

	public void setUplaodFile(String pathStr) {
		uploadFile.sendKeys(pathStr);
	}

}
