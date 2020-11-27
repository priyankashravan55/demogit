package com.cjc.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class DocumentsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doc_id;
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] addressProof;
	@Lob
	private byte[] bankStatemnet;
	@Lob
	private byte[] bankCheck;
	private int cust_id;
	
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public byte[] getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}
	public byte[] getPanCard() {
		return panCard;
	}
	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public byte[] getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(byte[] addressProof) {
		this.addressProof = addressProof;
	}
	public byte[] getBankStatemnet() {
		return bankStatemnet;
	}
	public void setBankStatemnet(byte[] bankStatemnet) {
		this.bankStatemnet = bankStatemnet;
	}
	public byte[] getBankCheck() {
		return bankCheck;
	}
	public void setBankCheck(byte[] bankCheck) {
		this.bankCheck = bankCheck;
	}
	
	
	
	
	

}
