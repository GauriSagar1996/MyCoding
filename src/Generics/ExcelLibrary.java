package Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary  {

	public static String getCellValue(String path,String sheet,int row,int cell) throws Exception {
		String cellValue;
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	    cellValue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
		
	}
}
