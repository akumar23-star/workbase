package com.colt.net.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colt.net.repository.CustomerRepository;
import com.colt.net.request.CustomerRequest;
import com.colt.net.response.CustomerResponse;
import com.colt.net.response.LabelValue;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepo;
	
	public CustomerResponse createCustomer(CustomerRequest customerRequest) {
		
		CustomerResponse customerResponse =new CustomerResponse(); 
		CustomerRequest cr=customerRepo.save(customerRequest);
		customerResponse.setCountryId(cr.getCountryId());
		
		return customerResponse;
		
	}
	
	public CustomerResponse viewCustomer(String customerId) {
		CustomerResponse customerResponse =new CustomerResponse(); 
		LabelValue labelvalue=new LabelValue();
		
		CustomerRequest cr=customerRepo.findOne(customerId);
		labelvalue.setLabel("INDIA");
		labelvalue.setValue(cr.getCountryId());
		List<LabelValue> labelinfo=new ArrayList<LabelValue>();
		labelinfo.add(labelvalue);
		customerResponse.setCustomerId(cr.getCustomerId());
		customerResponse.setCountryId(cr.getCountryId());
		customerResponse.setCustomerTypeId(cr.getType());
		customerResponse.setCountryList(labelinfo);
		customerResponse.setCustomerName(cr.getName());
		
		
		
		return customerResponse;
		
	}
	

}
