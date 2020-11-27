package com.cjc.app.mfi.master.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.mfi.master.main.Repository.GranterREpository;
import com.cjc.app.mfi.master.main.model.GuarantorDetails;
import com.cjc.app.mfi.master.main.service_Interface.GranterServjce;
@Service
public class Granterimpl implements GranterServjce {
	@Autowired
	GranterREpository gr;

	@Override
	public void saveEnquiryData(GuarantorDetails gd) {
		gr.save(gd);
		
	}

}
