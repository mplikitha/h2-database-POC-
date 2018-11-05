package com.example.springboot.h2Demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.h2Demo.domain.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
