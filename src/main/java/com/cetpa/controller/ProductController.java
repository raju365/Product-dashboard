package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.entity.Product;
import com.cetpa.service.ProductService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	@RequestMapping("dashboard")
	public String getProductDashboard(Model model)
	{
		List<Product> productList=productService.getList();
		model.addAttribute("plist",productList);
		return "product-dashboard.jsp";
	}
	@RequestMapping("add")
	public String getAddProductView()
	{
		return "add-product.jsp";
	}
	@RequestMapping("save-record")
	public String saveProductRecord(Product product)
	{
		productService.saveRecord(product);
		return "redirect:dashboard";
	}
	@RequestMapping("delete-record")
	public String deleteProductRecord(int pid)
	{
		productService.deleteRecord(pid);
		return "redirect:dashboard";
	}
	@RequestMapping("edit-record")
	public String getEditProductview(int pid,Model model)
	{
		Product product=productService.getRecord(pid);
		model.addAttribute("product",product);
		return "edit-product.jsp";
	}
	@RequestMapping("update-record")
	public String updateProductRecord(Product product)
	{
		productService.updateRecord(product);
		return "redirect:dashboard";
	}
}
