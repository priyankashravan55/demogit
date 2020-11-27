package com.cjc.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CustomerAddress {
	@Id
	private int cid;
	private String cityname;
	private String areaname;
	private long pincode;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}
