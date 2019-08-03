package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteDataFromExcel 
{
	public void readDataFromExcel(String path, String fileName) throws FileNotFoundException , Exception
	{
		File file = new File(path+"\\"+fileName);
		FileInputStream fis = new FileInputStream(file);
				
		Workbook book = null;
		
		if(fileName.substring(fileName.indexOf(".")).equals(".xlsx"))
		{
			book = new XSSFWorkbook(fis);			
		}
		else if(fileName.substring(fileName.indexOf(".")).equals(".xls"))
		{
			book = new HSSFWorkbook(fis);
		}
		else
		{
			System.out.println("Not a valid file type");
		}
		
		Sheet sheet = book.getSheet("Sheet1");
		int ttlRows = sheet.getPhysicalNumberOfRows();
		
		for(int i = 1; i < ttlRows; i++)
		{
			int ttlCells = sheet.getRow(i).getLastCellNum();
			for(int j=0; j<ttlCells; j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"|"+"\t");
			}
			System.out.println();
		}
	}
	
	public void writeDataToExcel(String path, String fileName) throws IOException
	{
		File file = new File(path+"\\"+fileName);
		FileInputStream fis = new FileInputStream(file);
		Workbook book = null;
		if(fileName.substring(fileName.indexOf(".")).equals(".xlsx"))
		{
			book = new XSSFWorkbook(fis);
		}
		else if(fileName.substring(fileName.indexOf(".")).equals(".xls"))
		{
			book = new HSSFWorkbook(fis);
		}
		else
		{
			System.out.println("Not a valid file type");
		}
		Sheet sheet = book.createSheet("Info");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Mxone");
		row.createCell(1).setCellValue("Mxone@123");
		
		FileOutputStream fos = new FileOutputStream(file);
		book.write(fos);
		fos.close();
		fis.close();
	}
	
	public static void main(String[] args) 
	{
		String path = System.getProperty("user.dir")+"\\src\\selenium";
		String fileName = "LoginData.xlsx";
		ReadAndWriteDataFromExcel obj = new ReadAndWriteDataFromExcel();
		try
		{
			obj.readDataFromExcel(path, fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			obj.writeDataToExcel(path, fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
