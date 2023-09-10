package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TestCasesPage {
	WebDriver driver;
	
	TestCasesPage(WebDriver driver){
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this);
	}
	
	@FindBy(xpath = "//a[@href='/test_cases']/i[@class='fa fa-list']")
	private WebElement testCaseBtn;
	@FindBy(xpath = "//b[contains(text(), 'Test Cases')]")
	private WebElement verifyTestCasePage;
	
	public void openTestCasePage() {
		testCaseBtn.click();
	}
	
	public String verifyTestCasePage() {
		return verifyTestCasePage.getText();
	}
}
