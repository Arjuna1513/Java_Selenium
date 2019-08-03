package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{		
		File file = new File("C:\\Users\\mallikar\\Desktop\\MX-ONE\\selenium\\xlsx_Files\\Data1.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Sheet0");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Mitel");
		row.createCell(1).setCellValue("Mitel@123");
		book.write(fos);
		fos.close();
		book.close();
		
	}
}
