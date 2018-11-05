package com.example.springboot.h2Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.h2Demo.domain.Customer;
import com.example.springboot.h2Demo.service.CustomerService;

@RestController
@RequestMapping("api/v1")
public class CustomerController {
	
	@Autowired 
	private CustomerService customerService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
	return "hii working fine!!";
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAll(){
		List<Customer> customer= customerService.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}

}
