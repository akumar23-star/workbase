package com.colt.net.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colt.net.Exception.RecordNotFoundException;
import com.colt.net.request.CustomerRequest;
import com.colt.net.response.CustomerResponse;
import com.colt.net.service.CustomerService;

@RestController
@RequestMapping(path = "/manageCustomer")
public class CustomerController {
	
	    @Autowired
	    CustomerService service;
	
	    @RequestMapping(value = "/createCustomer" ,method=RequestMethod.POST)
	    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest){
	    	CustomerResponse creatdRsponse = service.createCustomer(customerRequest);
	        return new ResponseEntity<CustomerResponse>(creatdRsponse, new HttpHeaders(), HttpStatus.OK);
	    }
	 
	    @RequestMapping(value = "/viewCustomer" ,method=RequestMethod.GET)
	    public ResponseEntity<CustomerResponse> viewCustomer(@RequestParam("customerId") String customerId){
	    	CustomerResponse viewResponse = service.viewCustomer(customerId);
	        return new ResponseEntity<CustomerResponse>(viewResponse, new HttpHeaders(), HttpStatus.OK);
	    }

	    @RequestMapping(value = "/updateCustomer/{customerId}" ,method=RequestMethod.PUT)
	    public ResponseEntity<CustomerRequest> updateCustomer(@RequestBody CustomerRequest customerRequest,@PathVariable("customerId")String  customerId){
	    	CustomerRequest updatedResponse = service.updateCustomer(customerRequest,customerId);
	        return new ResponseEntity<CustomerRequest>(updatedResponse, new HttpHeaders(), HttpStatus.OK);
	    }
	    
	    @RequestMapping(value = "/deleteCustomer/{customerId}" ,method=RequestMethod.DELETE)
	    public HttpStatus deleteCustomer(@PathVariable("customerId")String  customerId) throws RecordNotFoundException{
	    	System.out.print("customerId"+customerId);
	    	 service.deleteCustomer(customerId);
	         return HttpStatus.FORBIDDEN;
	    }
}
