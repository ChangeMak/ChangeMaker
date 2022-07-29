package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook ws;
	
	public ExcelDataProvider() throws Exception {
	
	String path="C:\\Users\\HP\\ChangeMaker\\TestDate\\TestData.xlsx";
	FileInputStream file=new FileInputStream (path);
	 ws=new XSSFWorkbook(file);
	
	}

	public String getExceldata(String Sheet,int row,int cell) {
		
	return ws.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		
		
	}
	
	
}
