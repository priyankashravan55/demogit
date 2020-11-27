package com.cjc.app.mfi.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.mfi.master.main.model.CustomerDetails;
import com.cjc.app.mfi.master.main.service_Interface.CustomerService;

@RestController
public class CustomerDetailsCntroller {
	
	
@Autowired	
CustomerService cs;


@PostMapping("/Cust_details")
public String cust_details_info_Insert(@RequestBody CustomerDetails cd){
	
	cs.savedata(cd);
	
	
	return "data inserted successfully";
	
}


@GetMapping("/get_cust_details")
public List<CustomerDetails> getdata(){
	List<CustomerDetails>list=cs.displayData();
	//System.out.println(list);
	return list;
}
	
	

}
