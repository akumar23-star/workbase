package com.colt.net.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colt.net.Exception.RecordNotFoundException;
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
		customerResponse.setCustomerId(cr.getCustomerId());
		
		return customerResponse;
		
	}
	
	public CustomerResponse viewCustomer(String customerId) {
		CustomerResponse customerResponse =new CustomerResponse(); 
		LabelValue labelvalue=new LabelValue();
		Optional<CustomerRequest> cr = customerRepo.findById(customerId);
		if(cr.isPresent()) {
			CustomerRequest customerRequest = cr.get();
			labelvalue.setLabel("INDIA");
			labelvalue.setValue(customerRequest.getCountryId());
			List<LabelValue> labelinfo=new ArrayList<LabelValue>();
			labelinfo.add(labelvalue);
			customerResponse.setCustomerId(customerRequest.getCustomerId());
			customerResponse.setCountryId(customerRequest.getCountryId());
			customerResponse.setCustomerTypeId(customerRequest.getType());
			customerResponse.setCountryList(labelinfo);
			customerResponse.setCustomerName(customerRequest.getName());
			}
		
		return customerResponse;
		
	}
	
	public CustomerRequest updateCustomer(CustomerRequest customerRequest,String customerId) {
		Optional<CustomerRequest>  customerValue = customerRepo.findById(customerRequest.getCustomerId());
        
        if(customerValue.isPresent())
        {
        	CustomerRequest updatedRequest = customerValue.get();
        	updatedRequest.setCustomerId(customerId);
        	updatedRequest.setCountryId(customerRequest.getCountryId());
        	updatedRequest.setName(customerRequest.getName());
        	updatedRequest.setEmail(customerRequest.getEmail());
        	updatedRequest.setDedicatedPortal(customerRequest.getDedicatedPortal());
        	updatedRequest.setFax(customerRequest.getFax());
        	updatedRequest.setMainDomain(customerRequest.getMainDomain());
        	updatedRequest.setOcn(customerRequest.getOcn());
        	updatedRequest.setPhone(customerRequest.getPhone());
        	updatedRequest.setReferance(customerRequest.getReferance());
        	updatedRequest.setTechinicalContact(customerRequest.getTechinicalContact());
        	updatedRequest.setType(customerRequest.getType());
            
 
        	updatedRequest = customerRepo.save(updatedRequest);
             
            return updatedRequest;
        } else {
        	customerRequest = customerRepo.save(customerRequest);
             
            return customerRequest;
        }
		
	}
	
	  public void deleteCustomer(String customerId) throws RecordNotFoundException
	    {
	        Optional<CustomerRequest> customerRequest = customerRepo.findById(customerId);
	         
	        if(customerRequest.isPresent())
	        {
	        	customerRepo.deleteById(customerId);
	        } else {
	            throw new RecordNotFoundException("No customer record exist for given id");
	        }
	    }
	
	

}
