package com.nt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;

	private String cName;
	private long cPhNo;
	private String cMail;
	private String cCity;
	private String cDist;
	private String eType;
	public Customer(int cId, String cName, long cPhNo, String cMail, String cCity, String cDist, String eType) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPhNo = cPhNo;
		this.cMail = cMail;
		this.cCity = cCity;
		this.cDist = cDist;
		this.eType = eType;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getcPhNo() {
		return cPhNo;
	}
	public void setcPhNo(long cPhNo) {
		this.cPhNo = cPhNo;
	}
	public String getcMail() {
		return cMail;
	}
	public void setcMail(String cMail) {
		this.cMail = cMail;
	}
	public String getcCity() {
		return cCity;
	}
	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	public String getcDist() {
		return cDist;
	}
	public void setcDist(String cDist) {
		this.cDist = cDist;
	}
	public String geteType() {
		return eType;
	}
	public void seteType(String eType) {
		this.eType = eType;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cPhNo=" + cPhNo + ", cMail=" + cMail + ", cCity="
				+ cCity + ", cDist=" + cDist + ", eType=" + eType + "]";
	}


	

}
