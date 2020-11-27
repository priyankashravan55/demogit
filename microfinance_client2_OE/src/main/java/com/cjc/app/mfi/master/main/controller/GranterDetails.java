package com.cjc.app.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.mfi.master.main.model.GuarantorDetails;
import com.cjc.app.mfi.master.main.service_Interface.GranterServjce;

@RestController
@CrossOrigin("*")
public class GranterDetails {
	@Autowired
	GranterServjce gs;
	
	@PostMapping("/post")
	public String insertEnquiryDetails(@RequestBody GuarantorDetails gd) {
gs.saveEnquiryData(gd);
return "enquiry data save successfully";
}

	
	
}
