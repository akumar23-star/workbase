package com.colt.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colt.net.request.CustomerRequest;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRequest,String> {

}
