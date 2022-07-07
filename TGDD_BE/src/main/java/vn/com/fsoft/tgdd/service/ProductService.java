package vn.com.fsoft.tgdd.service;

import java.util.List;

import vn.com.fsoft.tgdd.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	
	void saveProduct(Product product);
	
	void deleteProduct(String productID);
	
	Product findByID(String productID);
	
	List<Product> findAll();
}
