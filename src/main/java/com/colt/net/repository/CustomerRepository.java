package com.colt.net.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colt.net.request.CustomerRequest;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerRequest,String> {

}
