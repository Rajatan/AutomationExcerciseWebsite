package e_commerce.repository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Resources extends ExcelDataImport{

	public void selectByValues(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}

	public void scrollBySize(WebDriver driver, int size) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, "+size+")");
	}

}
