package com.colt.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.colt.net.request.JwtAuthneticateRequest;
import com.colt.net.response.JwtAuthenticationResponse;
import com.colt.net.service.UserDetailService;
import com.colt.util.JwtTokenUtil;
@RestController
@RequestMapping(path = "/application")
@CrossOrigin
public class CustomerAccountLoginController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailService userDetailsService;
	
	
	
	   @RequestMapping(value = "/authenticate" ,method=RequestMethod.POST)
	    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtAuthneticateRequest authRequest)throws Exception{
	    	//CustomerResponse creatdRsponse = service.createCustomer(customerRequest);
		  authenticate(authRequest.getUserName(), authRequest.getPassword());
		  final UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUserName());
           final String token = jwtTokenUtil.generateToken(userDetails);
           return ResponseEntity.ok(new JwtAuthenticationResponse(token));
	    } 
	   
	  
	  private void authenticate(String username, String password) throws Exception {
			try {
				authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			} catch (DisabledException e) {
				throw new Exception("USER_DISABLED", e);
			} catch (BadCredentialsException e) {
				throw new Exception("INVALID_CREDENTIALS", e);
			}
		}

}
