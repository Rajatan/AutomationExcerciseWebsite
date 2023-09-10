package e_commerce;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class TestCasePage_Test extends Ecomm_BaseFile {

	WebDriver driver;

	@BeforeTest
	public void initBrowser() {
		driver = initDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
	}
// Test Case 7: Verify Test Cases Page 
	@Test
	public void testCasePage_Test() {
		LoginPage login = new LoginPage(driver);
		assertEquals(login.verifyHomepage(), "Automation Exercise");
		TestCasesPage testCases = new TestCasesPage(driver);
		testCases.openTestCasePage();
		assertEquals(testCases.verifyTestCasePage().trim(), "TEST CASES");
	}

}
