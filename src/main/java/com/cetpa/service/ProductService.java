package com.cetpa.service;

import java.util.List;

import com.cetpa.entity.Product;

public interface ProductService 
{
	List<Product> getList();
	void saveRecord(Product product);
	void deleteRecord(int pid);
	Product getRecord(int pid);
	void updateRecord(Product product);
}
