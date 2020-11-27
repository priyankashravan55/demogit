package com.cjc.app.mfi.master.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.mfi.master.main.Repository.GranterREpository;
import com.cjc.app.mfi.master.main.Repository.HomeRepository;
import com.cjc.app.mfi.master.main.model.DocumentsDetails;
import com.cjc.app.mfi.master.main.model.GuarantorDetails;
import com.cjc.app.mfi.master.main.service_Interface.ServerceInterface;

@Service
public class ServiceImple implements ServerceInterface{
@Autowired
HomeRepository hr;
@Autowired
GranterREpository gr;
	@Override
	public void saveDoc(DocumentsDetails dd) {
		
		hr.save(dd);
		
	}
	
	


	

}
