package com.colt.net.request;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CUSTOMER")
public class CustomerRequest implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String customerId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mainDomain")
	private String mainDomain;
	
	
	@Column(name="countryId")
	private String countryId;
	
	@Column(name="ocn")
	private String ocn;
	
	@Column(name="referance")
	private String referance;
	
	@Column(name="type")
	private String type;
	
	@Column(name="techinicalContact")
	private String techinicalContact;
	
	@Column(name="phone")
	private String phone;
	@Column(name="fax")
	private String fax;
	
	@Column(name="dedicatedPortal")
	private String dedicatedPortal;
	
	@Column(name="email")
	private String email;
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMainDomain() {
		return mainDomain;
	}
	public void setMainDomain(String mainDomain) {
		this.mainDomain = mainDomain;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getOcn() {
		return ocn;
	}
	public void setOcn(String ocn) {
		this.ocn = ocn;
	}
	public String getReferance() {
		return referance;
	}
	public void setReferance(String referance) {
		this.referance = referance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTechinicalContact() {
		return techinicalContact;
	}
	public void setTechinicalContact(String techinicalContact) {
		this.techinicalContact = techinicalContact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getDedicatedPortal() {
		return dedicatedPortal;
	}
	public void setDedicatedPortal(String dedicatedPortal) {
		this.dedicatedPortal = dedicatedPortal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
