package com.cjc.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PreviousLoan {
	@Id
	 private int pre_id;
     private double loan_amount;
     private double pending_emi;
    private double remaining_amount;
     private String bk_name;
    private String bk_IFSC_code;
	public int getPre_id() {
		return pre_id;
	}
	public void setPre_id(int pre_id) {
		this.pre_id = pre_id;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getPending_emi() {
		return pending_emi;
	}
	public void setPending_emi(double pending_emi) {
		this.pending_emi = pending_emi;
	}
	public double getRemaining_amount() {
		return remaining_amount;
	}
	public void setRemaining_amount(double remaining_amount) {
		this.remaining_amount = remaining_amount;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getBk_IFSC_code() {
		return bk_IFSC_code;
	}
	public void setBk_IFSC_code(String bk_IFSC_code) {
		this.bk_IFSC_code = bk_IFSC_code;
	}
    

}
