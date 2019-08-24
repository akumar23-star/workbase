package com.colt.net.response;

import java.io.Serializable;
import java.util.List;

public class CustomerResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String countryId;
	private String customerTypeId;
	private String customerName;
	private String customerId;
	private String oracleCustomerId;
	private String isActive;
	private List<LabelValue> countryList;
	private List<LabelValue> customerTypeList;
	private String trailCustomerName;
	private String enableDedicatedPortal;
	private String dedicatedPortalId;
	private List<LabelValue> dedicatedPortalList;
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCustomerTypeId() {
		return customerTypeId;
	}
	public void setCustomerTypeId(String customerTypeId) {
		this.customerTypeId = customerTypeId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOracleCustomerId() {
		return oracleCustomerId;
	}
	public void setOracleCustomerId(String oracleCustomerId) {
		this.oracleCustomerId = oracleCustomerId;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public List<LabelValue> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<LabelValue> countryList) {
		this.countryList = countryList;
	}
	public List<LabelValue> getCustomerTypeList() {
		return customerTypeList;
	}
	public void setCustomerTypeList(List<LabelValue> customerTypeList) {
		this.customerTypeList = customerTypeList;
	}
	public String getTrailCustomerName() {
		return trailCustomerName;
	}
	public void setTrailCustomerName(String trailCustomerName) {
		this.trailCustomerName = trailCustomerName;
	}
	public String getEnableDedicatedPortal() {
		return enableDedicatedPortal;
	}
	public void setEnableDedicatedPortal(String enableDedicatedPortal) {
		this.enableDedicatedPortal = enableDedicatedPortal;
	}
	public String getDedicatedPortalId() {
		return dedicatedPortalId;
	}
	public void setDedicatedPortalId(String dedicatedPortalId) {
		this.dedicatedPortalId = dedicatedPortalId;
	}
	public List<LabelValue> getDedicatedPortalList() {
		return dedicatedPortalList;
	}
	public void setDedicatedPortalList(List<LabelValue> dedicatedPortalList) {
		this.dedicatedPortalList = dedicatedPortalList;
	}
	
	
	
	

}
