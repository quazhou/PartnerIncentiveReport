package com.cisco.action;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.cisco.service.PartnerIncentiveService;
import com.cisco.dto.Form;
import com.cisco.model.PartnerResult;
import com.cisco.dto.DataGridModel;

@Controller("partner_incentive")
@Scope("prototype")
public class PartnerIncentiveAction extends ActionSupport{
	
	private PartnerIncentiveService pis;
	private List<PartnerResult> partnerResult;
	private Form form;
	
	public Form getForm() {
		return form;
	}
	public void setForm(Form form) {
		this.form = form;
	}


	//esayui grid需要的是json对象，而不是json串，故需要使用JSONArray对其进行封装
	//private JSONArray dataRows;
	private JSONObject dataRows;
	
	private String filters; 

	public String getFilters() {
		return filters;
	}
	public void setFilters(String filters) {
		this.filters = filters;
	}
	public List<PartnerResult> getPartnerResult() {
		return partnerResult;
	}
	public PartnerIncentiveService getPis() {
		return pis;
	}
	
	

	public JSONObject getDataRows() {
		return dataRows;
	}

	public String load() throws Exception{
		/*partnerResult=pis.load();
		rows=JSONArray.fromObject(partnerResult);
		System.out.println(rows);
		//System.out.println(quarter);
		return "load";*/
		
		if(form==null){
			form=new Form();
		}
		partnerResult=pis.load(form);
		DataGridModel dgm=new DataGridModel();
		dgm.setRows(partnerResult);
		dgm.setTotal(3026);
		dataRows=JSONObject.fromObject(dgm);
		//dataRows=JSONArray.fromObject(partnerResult);
		//System.out.println(rows);
		//System.out.println(quarter);
		return "load";
	}
	

	public String loadFilters(){
		this.filters="Q1";
		return "loadFilters";
	}

	

	public void setPartnerResult(List<PartnerResult> partnerResult) {
		this.partnerResult = partnerResult;
	}
	@Resource(name="partner_incentive_service")
	public void setPis(PartnerIncentiveService pis) {
		this.pis = pis;
	}
	
	
	public void setDataRows(JSONObject rows) {
		this.dataRows = rows;
	}
	
	
}
