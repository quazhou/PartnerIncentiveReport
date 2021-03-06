package com.cisco.dto;

public class Form {
	
	private String quarter="Q4";
	private Integer year=2014;
	private Integer clawbackPeriod=90;
	private Integer iarrRebateTermMultiplier=12;
	private Double iarrRebatePercentage=0.25;
	private Double iarrPartnerRebateThreshold=Double.valueOf("1600");
	private Double lifeRebatePercentageThreshold=0.9;
	private Integer lifeRebateTermMultiplier=6;
	private Double lifeRebatePercentage=0.07;
	private Integer page=1;
	private Integer rows=50;
	
	public Integer getClawbackPeriod() {
		return clawbackPeriod;
	}
	public Double getIarrPartnerRebateThreshold() {
		return iarrPartnerRebateThreshold;
	}
	public Double getIarrRebatePercentage() {
		return iarrRebatePercentage;
	}
	public Integer getIarrRebateTermMultiplier() {
		return iarrRebateTermMultiplier;
	}

	public Double getLifeRebatePercentage() {
		return lifeRebatePercentage;
	}
	public Double getLifeRebatePercentageThreshold() {
		return lifeRebatePercentageThreshold;
	}
	public Integer getLifeRebateTermMultiplier() {
		return lifeRebateTermMultiplier;
	}
	public Integer getPage() {
		return page;
	}
	public String getQuarter() {
		return quarter;
	}
	public Integer getRows() {
		return rows;
	}
	public Integer getYear() {
		return year;
	}
	public void setClawbackPeriod(int clawbackPeriod) {
		this.clawbackPeriod = clawbackPeriod;
	}
	public void setClawbackPeriod(Integer clawbackPeriod) {
		this.clawbackPeriod = clawbackPeriod;
	}
	public void setIarrPartnerRebateThreshold(Double iarrPartnerRebateThreshold) {
		this.iarrPartnerRebateThreshold = iarrPartnerRebateThreshold;
	}
	public void setIarrRebatePercentage(Double iarrRebatePercentage) {
		this.iarrRebatePercentage = iarrRebatePercentage;
	}
	public void setIarrRebateTermMultiplier(Integer iarrRebateTermMultiplier) {
		this.iarrRebateTermMultiplier = iarrRebateTermMultiplier;
	}
	public void setLifeRebatePercentage(Double lifeRebatePercentage) {
		this.lifeRebatePercentage = lifeRebatePercentage;
	}
	
	public void setLifeRebatePercentageThreshold(
			Double lifeRebatePercentageThreshold) {
		this.lifeRebatePercentageThreshold = lifeRebatePercentageThreshold;
	}
	public void setLifeRebateTermMultiplier(Integer lifeRebateTermMultiplier) {
		this.lifeRebateTermMultiplier = lifeRebateTermMultiplier;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
}
