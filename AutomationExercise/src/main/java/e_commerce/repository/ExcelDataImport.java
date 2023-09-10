package e_commerce.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataImport {

	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	Iterator<Row> rowIterator;
	Iterator<Cell> cellIterator;

	public static void main(String[] args) throws IOException {
		ExcelDataImport excel = new ExcelDataImport();
		excel.readFromExcel("Contact Us", "lname");

	}

	public String readFromExcel(String sheetName, String attribute) throws IOException {

		fis = new FileInputStream(System.getProperty("user.dir") + "/AutomationExercise_Data.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(0);
		rowIterator = sheet.iterator();
//		System.out.println(row.getCell(0));

		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
//			Cell cell = row.getCell();
			cellIterator = row.iterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				if (cell.getStringCellValue().equals(attribute)) {
					cell = cellIterator.next();
					System.out.println(cell);
					return cell.getStringCellValue();
				}
			}
		}
		return ""+attribute+" didn't find in the "+sheetName+" excel data sheet.";
	}


}
