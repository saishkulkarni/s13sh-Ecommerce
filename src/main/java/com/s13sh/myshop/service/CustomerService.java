package com.s13sh.myshop.service;

import org.springframework.validation.BindingResult;

import com.s13sh.myshop.dto.Customer;

public interface CustomerService {
	String save(Customer customer, BindingResult result);
}
