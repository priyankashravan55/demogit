package com.cjc.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LoanDetails {
	@Id

	private int l_id;
    private double l_amount;
    private String l_reason;
    private String l_custname;
    private int l_rateOfintrest;
   private int  l_processingfee;
    private long l_emi;
    private long l_tenure;
    private long l_paymfi;
    @OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "previous_loan_id")
         private PreviousLoan previousLoan;
		public int getL_id() {
			return l_id;
		}
		public void setL_id(int l_id) {
			this.l_id = l_id;
		}
		public double getL_amount() {
			return l_amount;
		}
		public void setL_amount(double l_amount) {
			this.l_amount = l_amount;
		}
		public String getL_reason() {
			return l_reason;
		}
		public void setL_reason(String l_reason) {
			this.l_reason = l_reason;
		}
		public String getL_custname() {
			return l_custname;
		}
		public void setL_custname(String l_custname) {
			this.l_custname = l_custname;
		}
		public int getL_rateOfintrest() {
			return l_rateOfintrest;
		}
		public void setL_rateOfintrest(int l_rateOfintrest) {
			this.l_rateOfintrest = l_rateOfintrest;
		}
		public int getL_processingfee() {
			return l_processingfee;
		}
		public void setL_processingfee(int l_processingfee) {
			this.l_processingfee = l_processingfee;
		}
		public long getL_emi() {
			return l_emi;
		}
		public void setL_emi(long l_emi) {
			this.l_emi = l_emi;
		}
		public long getL_tenure() {
			return l_tenure;
		}
		public void setL_tenure(long l_tenure) {
			this.l_tenure = l_tenure;
		}
		public long getL_paymfi() {
			return l_paymfi;
		}
		public void setL_paymfi(long l_paymfi) {
			this.l_paymfi = l_paymfi;
		}
		public PreviousLoan getPreviousLoan() {
			return previousLoan;
		}
		public void setPreviousLoan(PreviousLoan previousLoan) {
			previousLoan = previousLoan;
		}
         
         
         
}
