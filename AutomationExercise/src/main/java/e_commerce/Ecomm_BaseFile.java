package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecomm_BaseFile {
	
	public WebDriver initDriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
