package com.cisco.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import net.sf.json.JSONArray;

import com.cisco.dto.Filter;
import com.cisco.service.PartnerIncentiveFilterService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("partner_incentive_filter")
@Scope("prototype")
public class PartnerIncentiveFilterAction extends ActionSupport {
	private String filterName;
	private JSONArray values;
	private PartnerIncentiveFilterService partnerIncentiveFilterService;
	
	
	public PartnerIncentiveFilterService getPartnerIncentiveFilterService() {
		return partnerIncentiveFilterService;
	}

	@Resource(name="partner_incentive_filter_service")
	public void setPartnerIncentiveFilterService(
			PartnerIncentiveFilterService partnerIncentiveFilterService) {
		this.partnerIncentiveFilterService = partnerIncentiveFilterService;
	}

	public JSONArray getValues() {
		return values;
	}

	public void setValues(JSONArray values) {
		this.values = values;
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}
	
	public String load() throws SQLException{
		List<Filter> valueList=partnerIncentiveFilterService.load(filterName);
//		Filter value=new Filter();
//		value.setVal("Q1");
//		valueList.add(value);
		
		values=JSONArray.fromObject(valueList);
		return "load";
	}
}
