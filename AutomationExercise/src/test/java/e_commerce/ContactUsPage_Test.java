package e_commerce;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactUsPage_Test extends Ecomm_BaseFile {
	
	WebDriver driver;
	@BeforeTest
	public void initBrowser() {
		driver = initDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
	}
//Test case: 6 done till file upload
	@Test
	public void contactUsPage_Test() throws IOException {
		ContactUsPage contact = new ContactUsPage(driver);
		assertEquals(contact.verifyHomepage(), "Automation Exercise");
		contact.openContactUsPage();
		assertEquals(contact.verifyHomepage().trim(), "GET IN TOUCH");
		contact.setName(contact.readFromExcel("Contact Us", "name"));
		contact.setEmail(contact.readFromExcel("Contact Us", "email"));
		contact.setSubject(contact.readFromExcel("Contact Us", "subject"));
		contact.setMessage(contact.readFromExcel("Contact Us", "message"));
		contact.setUplaodFile(System.getProperty("user.dir")+"TestFile.pdf");
		
		
	}
}
