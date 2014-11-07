package com.cisco.model;

public class PartnerResult {
	private int clawbackPeriod;
	private String quarter;
	private String year;
	private Integer iarrRebateTermMultiplier;
	private Double iarrRebatePercentage;
	private Double iarrPartnerRebateThreshold;
	private Double lifeRebatePercentageThreshold;
	private Integer lifeRebateTermMultiplier;
	private Double lifeRebatePercentage;
	public int getClawbackPeriod() {
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
