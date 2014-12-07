package com.cisco.model;

import java.sql.Timestamp;

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
	
	private String partnerName;
	private String pdbbegeoid;
	
	private String country;
	private String subId;
	
	private String subFromDate;
	private String subToDate;
	private String preSubId;
	private String ccwId;
	private String orderEndDate;
	private String orderType;
	private String sellType;
	private String skuId;
	private String skuDescr;
	private String skuQuantity;
	private String unitPrice;
	private String extUnitPrice;
	private String skuMrr;
	private double subMrr;
	private String currency;
	private String partnerNo;
	
	private double iarr;
	private double partnerIarr;
	private double lcInitial;
	private double lcEnd;
	private double partnerLcRebate;
	private double iarrAccrual;
	private double partnerIarrAcc;
	private double lcAccInitial;
	private double lcAccEnd;
	private double partnerTotalAcc;
	private double partnerTotalIG;
	private double partnerTotalTrueUp;
	
	
	public double getPartnerIarr() {
		return partnerIarr;
	}
	public void setPartnerIarr(double partnerIarr) {
		this.partnerIarr = partnerIarr;
	}
	public String getCcwId() {
		return ccwId;
	}
	public int getClawbackPeriod() {
		return clawbackPeriod;
	}
	public String getCountry() {
		return country;
	}
	public String getCurrency() {
		return currency;
	}
	public String getExtUnitPrice() {
		return extUnitPrice;
	}
	public double getIarr() {
		return iarr;
	}
	public double getIarrAccrual() {
		return iarrAccrual;
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
	public double getLcAccEnd() {
		return lcAccEnd;
	}
	public double getLcAccInitial() {
		return lcAccInitial;
	}

	public double getLcEnd() {
		return lcEnd;
	}
	public double getLcInitial() {
		return lcInitial;
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
	public String getOrderEndDate() {
		return orderEndDate;
	}
	public String getOrderType() {
		return orderType;
	}
	public double getPartnerIarrAcc() {
		return partnerIarrAcc;
	}
	public double getPartnerLcRebate() {
		return partnerLcRebate;
	}
	public String getPartnerName() {
		return partnerName;
	}
	
	
	public String getPartnerNo() {
		return partnerNo;
	}
	public double getPartnerTotalAcc() {
		return partnerTotalAcc;
	}
	public double getPartnerTotalIG() {
		return partnerTotalIG;
	}
	public double getPartnerTotalTrueUp() {
		return partnerTotalTrueUp;
	}
	public String getPdbbegeoid() {
		return pdbbegeoid;
	}
	public String getPreSubId() {
		return preSubId;
	}
	public String getQuarter() {
		return quarter;
	}
	public String getSellType() {
		return sellType;
	}
	public String getSkuDescr() {
		return skuDescr;
	}
	public String getSkuId() {
		return skuId;
	}
	public String getSkuMrr() {
		return skuMrr;
	}
	public String getSkuQuantity() {
		return skuQuantity;
	}
	public String getSubFromDate() {
		return subFromDate;
	}
	public String getSubId() {
		return subId;
	}
	public double getSubMrr() {
		return subMrr;
	}
	public String getSubToDate() {
		return subToDate;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public String getYear() {
		return year;
	}
	public void setCcwId(String ccwId) {
		this.ccwId = ccwId;
	}

	public void setClawbackPeriod(int clawbackPeriod) {
		this.clawbackPeriod = clawbackPeriod;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setExtUnitPrice(String extUnitPrice) {
		this.extUnitPrice = extUnitPrice;
	}
	public void setIarr(double iarr) {
		this.iarr = iarr;
	}
	public void setIarrAccrual(double iarr_accrual) {
		this.iarrAccrual = iarr_accrual;
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
	public void setLcAccEnd(double lcAccEnd) {
		this.lcAccEnd = lcAccEnd;
	}
	public void setLcAccInitial(double lcAccInitial) {
		this.lcAccInitial = lcAccInitial;
	}
	public void setLcEnd(double lcEnd) {
		this.lcEnd = lcEnd;
	}
	public void setLcInitial(double lcInitial) {
		this.lcInitial = lcInitial;
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
	public void setOrderEndDate(String orderEndDate) {
		this.orderEndDate = orderEndDate;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	

	public void setPartnerIarrAcc(double partnerIarrAcc) {
		this.partnerIarrAcc = partnerIarrAcc;
	}
	public void setPartnerLcRebate(double partnerLcRebate) {
		this.partnerLcRebate = partnerLcRebate;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public void setPartnerNo(String partnerNo) {
		this.partnerNo = partnerNo;
	}
	public void setPartnerTotalAcc(double partnerTotalAcc) {
		this.partnerTotalAcc = partnerTotalAcc;
	}
	public void setPartnerTotalIG(double partnerTotalIG) {
		this.partnerTotalIG = partnerTotalIG;
	}
	public void setPartnerTotalTrueUp(double partnerTotalTrueUp) {
		this.partnerTotalTrueUp = partnerTotalTrueUp;
	}
	public void setPdbbegeoid(String pdbbegeoid) {
		this.pdbbegeoid = pdbbegeoid;
	}
	public void setPreSubId(String preSubId) {
		this.preSubId = preSubId;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public void setSellType(String sellType) {
		this.sellType = sellType;
	}

	public void setSkuDescr(String skuDescr) {
		this.skuDescr = skuDescr;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public void setSkuMrr(String skuMrr) {
		this.skuMrr = skuMrr;
	}
	public void setSkuQuantity(String skuQuantity) {
		this.skuQuantity = skuQuantity;
	}
	public void setSubFromDate(String subFromDate) {
		this.subFromDate = subFromDate;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}
	public void setSubMrr(double subMrr) {
		this.subMrr = subMrr;
	}


	public void setSubToDate(String subToDate) {
		this.subToDate = subToDate;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
