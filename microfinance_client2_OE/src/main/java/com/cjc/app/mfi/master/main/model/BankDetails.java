package com.cjc.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDetails {
	
@Id
   private int bid;
    private String bank_name;
    private String branch;
   private String accountHolderName;
   private long accountNo;
    private String ifscCode;
   private String accountType;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getIfscCode() {
	return ifscCode;
}
public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
   
   

}
