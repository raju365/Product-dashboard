package com.cetpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Product;
import com.cetpa.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getList() 
	{
		return productRepository.getList();
	}
	public void saveRecord(Product product) 
	{
		productRepository.saveProduct(product);
	}
	public void deleteRecord(int pid) 
	{
		Product product=productRepository.getProduct(pid);
		productRepository.deleteProduct(product);
	}
	public Product getRecord(int pid) 
	{
		return productRepository.getProduct(pid);
	}
	public void updateRecord(Product nproduct) 
	{
		Product oproduct=productRepository.getProduct(nproduct.getPid());
		productRepository.updateProduct(oproduct,nproduct);
	}
}
