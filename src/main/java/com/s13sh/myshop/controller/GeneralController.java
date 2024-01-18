package com.s13sh.myshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.s13sh.myshop.dto.Customer;
import com.s13sh.myshop.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class GeneralController {

	@Autowired
	Customer customer;

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public String loadHome() {
		return "Home";
	}

	@GetMapping("/signup")
	public String loadSignup(ModelMap map) {
		map.put("customer", customer);
		return "Signup";
	}

	@GetMapping("/signin")
	public String loadLogin() {
		return "Login";
	}

	@PostMapping("/signup")
	public String signup(@Valid Customer customer, BindingResult result) {
		if (result.hasErrors())
			return "Signup";
		else
			return customerService.save(customer,result);
	}

}
