package com.s13sh.myshop.service.implementation;

import org.springframework.stereotype.Service;

import com.s13sh.myshop.dto.Customer;
import com.s13sh.myshop.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Service
public class AdminServiceImpl implements AdminService {

	@Override
	public String loadDashboard(HttpSession session) {
		Customer customer = (Customer) session.getAttribute("customer");
		if (customer == null) {
			session.setAttribute("failMessage", "Invalid Session");
			return "redirect:/signin";
		} else {
			if (customer.getRole().equals("ADMIN"))
				return "AdminDashBoard";
			else {
				session.setAttribute("failMessage", "You are Unauthorized to access his URL");
				return "redirect:/";
			}
		}
	}

	@Override
	public String loadAddProduct(HttpSession session) {
		Customer customer = (Customer) session.getAttribute("customer");
		if (customer == null) {
			session.setAttribute("failMessage", "Invalid Session");
			return "redirect:/signin";
		} else {
			if (customer.getRole().equals("ADMIN"))
			{
				return "AddProduct";
			}
			else {
				session.setAttribute("failMessage", "You are Unauthorized to access his URL");
				return "redirect:/";
			}
		}
	}

}
