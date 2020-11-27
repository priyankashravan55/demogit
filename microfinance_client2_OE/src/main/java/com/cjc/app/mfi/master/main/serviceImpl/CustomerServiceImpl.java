package com.cjc.app.mfi.master.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.mfi.master.main.Repository.CustomerRepository;

import com.cjc.app.mfi.master.main.model.CustomerDetails;
import com.cjc.app.mfi.master.main.service_Interface.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository cr;

	@Override
	public void savedata(CustomerDetails cd) {
		cr.save(cd);
	
	}

	@Override
	public List<CustomerDetails> displayData() {
		List<CustomerDetails>list=(List<CustomerDetails>) cr.findAll();
		return list;
	}

}
