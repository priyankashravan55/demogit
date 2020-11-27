package com.cjc.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GuranterDetails {
	@Id
	 private int gurantor_id;
	    private String gurantor_name;
	   private long  gurantor_mobno;
	    private String gurantor_gender;
	   private String  gurantor_dob;
	    private int gurantor_age;
	    private String gurantor_emailid;
	    private String gurantor_pancard;
	    private long gurantor_adharcard;
	    private String gurantor_occupation;
	    private Double gurantor_annualincome;
	    private String rel_with_cust;
	    private String localaddress;
	   private String  permenentaddress;
	   
	   
	   
	   
	   
	   
	   
	   
	   
	public int getGurantor_id() {
		return gurantor_id;
	}
	public void setGurantor_id(int gurantor_id) {
		this.gurantor_id = gurantor_id;
	}
	public String getGurantor_name() {
		return gurantor_name;
	}
	public void setGurantor_name(String gurantor_name) {
		this.gurantor_name = gurantor_name;
	}
	public long getGurantor_mobno() {
		return gurantor_mobno;
	}
	public void setGurantor_mobno(long gurantor_mobno) {
		this.gurantor_mobno = gurantor_mobno;
	}
	public String getGurantor_gender() {
		return gurantor_gender;
	}
	public void setGurantor_gender(String gurantor_gender) {
		this.gurantor_gender = gurantor_gender;
	}
	public String getGurantor_dob() {
		return gurantor_dob;
	}
	public void setGurantor_dob(String gurantor_dob) {
		this.gurantor_dob = gurantor_dob;
	}
	public int getGurantor_age() {
		return gurantor_age;
	}
	public void setGurantor_age(int gurantor_age) {
		this.gurantor_age = gurantor_age;
	}
	public String getGurantor_emailid() {
		return gurantor_emailid;
	}
	public void setGurantor_emailid(String gurantor_emailid) {
		this.gurantor_emailid = gurantor_emailid;
	}
	public String getGurantor_pancard() {
		return gurantor_pancard;
	}
	public void setGurantor_pancard(String gurantor_pancard) {
		this.gurantor_pancard = gurantor_pancard;
	}
	public long getGurantor_adharcard() {
		return gurantor_adharcard;
	}
	public void setGurantor_adharcard(long gurantor_adharcard) {
		this.gurantor_adharcard = gurantor_adharcard;
	}
	public String getGurantor_occupation() {
		return gurantor_occupation;
	}
	public void setGurantor_occupation(String gurantor_occupation) {
		this.gurantor_occupation = gurantor_occupation;
	}
	public Double getGurantor_annualincome() {
		return gurantor_annualincome;
	}
	public void setGurantor_annualincome(Double gurantor_annualincome) {
		this.gurantor_annualincome = gurantor_annualincome;
	}
	public String getRel_with_cust() {
		return rel_with_cust;
	}
	public void setRel_with_cust(String rel_with_cust) {
		this.rel_with_cust = rel_with_cust;
	}
	public String getLocaladdress() {
		return localaddress;
	}
	public void setLocaladdress(String localaddress) {
		this.localaddress = localaddress;
	}
	public String getPermenentaddress() {
		return permenentaddress;
	}
	public void setPermenentaddress(String permenentaddress) {
		this.permenentaddress = permenentaddress;
	}
	   
	   
	

}
