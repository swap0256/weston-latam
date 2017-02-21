package com.westconcomstor.latam.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib implements Constants {

	public String getExcelData(String sheetName,int rowNum,int colNum) throws IOException, EncryptedDocumentException, InvalidFormatException{
		
//	split to know if it is xls or xlsx then make objects accordingly and then return it to workbook reference
		String ext = filePath.split("\\.")[1];
	
		FileInputStream fis = new FileInputStream(filePath);
/*		Workbook wbookObj = null;
		if(ext.equalsIgnoreCase("xls")){
			wbookObj = new HSSFWorkbook(fis);
		}
		else{
			wbookObj = new XSSFWorkbook(fis);
		}
		return wbookObj;
*/
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		return data;
	}
	
	public void setExcelData(String sheetName,int rowNum,int colNum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = null;
		Cell cell = row.createCell(colNum);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		wb.close();
		}
	
	public int getRowCount(String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		FileInputStream fis =new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		return rowCount;
		
	}
}
