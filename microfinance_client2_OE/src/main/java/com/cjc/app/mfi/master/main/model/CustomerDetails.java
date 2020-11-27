package com.cjc.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails {
	@Id
	private int enq_id;
 	private long enq_adhar_no;
 	private String enq_dob;
 	private String enq_email_id;
 	private String enq_gender;
 	private long enq_mob_no;
 	private String enq_name;
 	private String enq_profession;
 	private String enq_pancard_no;
 	private int cibil;
 	private String remark;
 	private int customer_age;
 	private String customer_quilification;
 	private double cust_income;
 	private String cust_marital_status;
 	private int cust_noOfamilymember;
 	@OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "Address_Id")
 	private CustomerAddress customerAddress;
 	@OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "Guaranter_Id")
 	 private GuranterDetails  guranterDetails;
 	@OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "Bank_Id")
 	private  BankDetails  bankDetails;
 	@OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "Loan_Id")
 	private LoanDetails loanDetails;
	public int getEnq_id() {
		return enq_id;
	}
	public void setEnq_id(int enq_id) {
		this.enq_id = enq_id;
	}
	public long getEnq_adhar_no() {
		return enq_adhar_no;
	}
	public void setEnq_adhar_no(long enq_adhar_no) {
		this.enq_adhar_no = enq_adhar_no;
	}
	public String getEnq_dob() {
		return enq_dob;
	}
	public void setEnq_dob(String enq_dob) {
		this.enq_dob = enq_dob;
	}
	public String getEnq_email_id() {
		return enq_email_id;
	}
	public void setEnq_email_id(String enq_email_id) {
		this.enq_email_id = enq_email_id;
	}
	public String getEnq_gender() {
		return enq_gender;
	}
	public void setEnq_gender(String enq_gender) {
		this.enq_gender = enq_gender;
	}
	public long getEnq_mob_no() {
		return enq_mob_no;
	}
	public void setEnq_mob_no(long enq_mob_no) {
		this.enq_mob_no = enq_mob_no;
	}
	public String getEnq_name() {
		return enq_name;
	}
	public void setEnq_name(String enq_name) {
		this.enq_name = enq_name;
	}
	public String getEnq_profession() {
		return enq_profession;
	}
	public void setEnq_profession(String enq_profession) {
		this.enq_profession = enq_profession;
	}
	public String getEnq_pancard_no() {
		return enq_pancard_no;
	}
	public void setEnq_pancard_no(String enq_pancard_no) {
		this.enq_pancard_no = enq_pancard_no;
	}
	public int getCibil() {
		return cibil;
	}
	public void setCibil(int cibil) {
		this.cibil = cibil;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(int customer_age) {
		this.customer_age = customer_age;
	}
	public String getCustomer_quilification() {
		return customer_quilification;
	}
	public void setCustomer_quilification(String customer_quilification) {
		this.customer_quilification = customer_quilification;
	}
	public double getCust_income() {
		return cust_income;
	}
	public void setCust_income(double cust_income) {
		this.cust_income = cust_income;
	}
	public String getCust_marital_status() {
		return cust_marital_status;
	}
	public void setCust_marital_status(String cust_marital_status) {
		this.cust_marital_status = cust_marital_status;
	}
	public int getCust_noOfamilymember() {
		return cust_noOfamilymember;
	}
	public void setCust_noOfamilymember(int cust_noOfamilymember) {
		this.cust_noOfamilymember = cust_noOfamilymember;
	}
	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}
	public GuranterDetails getGuranterDetails() {
		return guranterDetails;
	}
	public void setGuranterDetails(GuranterDetails guranterDetails) {
		this.guranterDetails = guranterDetails;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public LoanDetails getLoanDetails() {
		return loanDetails;
	}
	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}
 	
 	
 	
 	
 	

}
