package com.cisco.dto;

public class Form {
	
	private String quarter;
	private String year;
	private Integer clawbackPeriod=90;
	private Integer iarrRebateTermMultiplier=12;
	private Double iarrRebatePercentage=0.25;
	private Double iarrPartnerRebateThreshold=Double.valueOf("1600");
	private Double lifeRebatePercentageThreshold=0.9;
	private Integer lifeRebateTermMultiplier=6;
	private Double lifeRebatePercentage=0.07;
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
	public String getQuarter() {
		return quarter;
	}
	public String getYear() {
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
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public void setYear(String year) {
		this.year = year;
	}
}
