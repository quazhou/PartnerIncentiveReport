package com.cisco.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.FontCharset;
import org.springframework.stereotype.Component;

@Component("excelService")
public class ExcelService {
	
	public void getExcelFile() throws Exception{
		String title[]={"Account_ID","Account_Name","Usage_Type","Site_Name","Phone_Type",// 
				"Meeting_Name", "Host_Name", "Phone_Number", "Department"};
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("EDR Comparison");
		//title
		HSSFRow row = sheet.createRow(0);
		
		for(int i=0;i<title.length;i++){
			HSSFCell cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}
		
		try{
		FileOutputStream os = new FileOutputStream("test.xls");
	    wb.write(os);
	    os.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
			throw new Exception("test.xls is not found");
		}catch(IOException e){
			System.out.println(e);
			throw new Exception("outputing file failed");
		}
		
	}
	
}
