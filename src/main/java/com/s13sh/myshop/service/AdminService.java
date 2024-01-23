package com.s13sh.myshop.service;

import jakarta.servlet.http.HttpSession;

public interface AdminService {

	String loadDashboard(HttpSession session);

	String loadAddProduct(HttpSession session);
	
}
