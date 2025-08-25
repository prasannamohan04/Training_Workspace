package com.sutherland.loanapplication.dto;


public class AadharDetails {
	private String AadharNum;
	private String PersonName;
	private String Address;
	/**
	 * @return the aadharNum
	 */
	public String getAadharNum() {
		return AadharNum;
	}
	/**
	 * @param aadharNum the aadharNum to set
	 */
	public void setAadharNum(String aadharNum) {
		AadharNum = aadharNum;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return PersonName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "AadharDetails [AadharNum=" + AadharNum + ", PersonName=" + PersonName + ", Address=" + Address + "]";
	}
	
}
