package com.cetpa.repository;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cetpa.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository 
{
	private Session session;
	private Transaction transaction;
	
	@Autowired
	public ProductRepositoryImpl(SessionFactory factory)
	{
		session=factory.openSession();
		transaction=session.getTransaction();
	}
	public List<Product> getList() 
	{
		Query<Product> query=session.createQuery("from Product",Product.class);
		return query.list();
	}
	public void saveProduct(Product product) 
	{
		transaction.begin();
		session.save(product);
		transaction.commit();
	}
	public Product getProduct(int pid) 
	{
		return session.get(Product.class,pid);
	}
	public void deleteProduct(Product product) 
	{
		transaction.begin();
		session.delete(product);
		transaction.commit();
	}
	public void updateProduct(Product oproduct, Product nproduct) 
	{
		transaction.begin();
		oproduct.setName(nproduct.getName());
		oproduct.setBrand(nproduct.getBrand());
		oproduct.setQuantity(nproduct.getQuantity());
		oproduct.setPrice(nproduct.getPrice());
		transaction.commit();
	}
}
