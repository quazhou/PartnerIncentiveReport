package com.cisco.action;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import com.cisco.model.Form;

@Controller("partner_incentive_form")
@Scope("prototype")
public class PartnerIncentiveFormAction extends ActionSupport{
	/**
	 * 
	 */
	
	private Form form;
	
	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	private String quarter;
	
	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	private static final long serialVersionUID = 1L;

	public String execute(){
		return SUCCESS;
	}
}
