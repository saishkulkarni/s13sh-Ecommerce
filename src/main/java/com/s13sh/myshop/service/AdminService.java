package com.s13sh.myshop.service;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import com.s13sh.myshop.dto.Product;

import jakarta.servlet.http.HttpSession;

public interface AdminService {

	String loadDashboard(HttpSession session);

	String loadAddProduct(HttpSession session, ModelMap map);

	String addProduct(Product product, BindingResult result, MultipartFile picture, HttpSession session, ModelMap map);

}
