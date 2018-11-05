package com.example.springboot.h2Demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Customer {
	
@Id
@GeneratedValue
private long id;
private String customerName;
private String mailId;
private String phoneNo;

public Customer() {
	
}

public Customer(long id, String customerName, String mailId, String phoneNo) {

	this.id = id;
	this.customerName = customerName;
	this.mailId = mailId;
	this.phoneNo = phoneNo;
}


}
