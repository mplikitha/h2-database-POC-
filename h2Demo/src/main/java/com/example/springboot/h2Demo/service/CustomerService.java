package com.example.springboot.h2Demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.h2Demo.domain.Customer;


public interface CustomerService {
	Customer save(Customer customer);
	List<Customer> getAllCustomer();

}
