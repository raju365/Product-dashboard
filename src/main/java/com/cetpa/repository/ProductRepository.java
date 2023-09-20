package com.cetpa.repository;

import java.util.List;

import com.cetpa.entity.Product;

public interface ProductRepository 
{
	List<Product> getList();
	void saveProduct(Product product);
	Product getProduct(int pid);
	void deleteProduct(Product product);
	void updateProduct(Product oproduct, Product nproduct);
}
