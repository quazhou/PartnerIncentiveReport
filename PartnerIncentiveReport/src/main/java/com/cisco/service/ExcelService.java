package com.cisco.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.FontCharset;
import org.springframework.stereotype.Component;

import com.cisco.dto.Form;
import com.cisco.model.PartnerResult;

@Component("excelService")
public class ExcelService {
	
	private PartnerIncentiveService pis;
	
	public PartnerIncentiveService getPis() {
		return pis;
	}
	
	@Resource(name="partner_incentive_service")
	public void setPis(PartnerIncentiveService pis) {
		this.pis = pis;
	}

	
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
		
		
		List<PartnerResult> partnerResult=pis.load(new Form());
		
		for(int i=0;i<partnerResult.size();i++){
			row = sheet.createRow(i+1);
			HSSFCell cell = row.createCell(0);
			cell.setCellValue(partnerResult.get(i).getQuarter());
			cell = row.createCell(1);
			cell.setCellValue(partnerResult.get(i).getYear());
			partnerResult.get(i).getClawbackPeriod();
			partnerResult.get(i).getIarrRebateTermMultiplier();
			partnerResult.get(i).getIarrRebatePercentage();
			partnerResult.get(i).getIarrPartnerRebateThreshold();
			partnerResult.get(i).getLifeRebatePercentageThreshold();
			partnerResult.get(i).getLifeRebateTermMultiplier();
			partnerResult.get(i).getLifeRebatePercentage();
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
