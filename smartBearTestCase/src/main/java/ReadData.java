

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * This Method help us to read data from the Property File and the data
 * 
 * @author TECQNIO
 *
 */
public class ReadData {

	public static String fromPropertyFile(String Key) {
		FileInputStream fis = null;
		Properties property = null;
		try {
			fis = new FileInputStream(new File("./TestData/Url.properties"));
			property = new Properties();
			property.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return property.getProperty(Key);
	}

	/***
	 * This Method Is used to read the data from the excel file of any
	 * format(xls,xlsx)
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 */
	public static String fromExcel(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis;
		Workbook workbook = null;

		try {
			fis = new FileInputStream(new File("./TestData/Number.xlsx"));
			try {
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}
}
