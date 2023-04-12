package com.clickwork.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * Generic class to read data from external source file
 * @author tamkeen
 *
 */
public class FileLib {
/**
 * Generic method to read data from Property File
 * @param key
 * @return
 * @throws IOException
 */
	
	public String getProperty(String key) throws IOException {
		FileInputStream f= new FileInputStream("./clickworkdata/clickWorkerData.property");
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(key);
	}
	/**
	 * This is Generic method used to read data from excelfile.
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws FileNotFoundException 
	 */
	
	
	public String getExcelData(String sheet, int row ,int cell) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	
}
