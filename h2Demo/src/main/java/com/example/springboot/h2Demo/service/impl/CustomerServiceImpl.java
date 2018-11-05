package com.example.springboot.h2Demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.h2Demo.domain.Customer;
import com.example.springboot.h2Demo.repository.CustomerRepo;
import com.example.springboot.h2Demo.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public CustomerServiceImpl(CustomerRepo customerRepo) {
	
		this.customerRepo = customerRepo;
	}

	@Override
	public Customer save(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
	List<Customer> customerList=(List<Customer>) customerRepo.findAll();
		return customerList;
	}

}
