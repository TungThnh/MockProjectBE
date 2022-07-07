package vn.com.fsoft.tgdd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.fsoft.tgdd.entity.Product;
import vn.com.fsoft.tgdd.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public void saveProduct(Product product) {
		productRepo.save(product);
	}

	@Override
	public void deleteProduct(String productID) {
		Product product = productRepo.findById(productID).get();
		product.setStatus(false);
		productRepo.save(product);
	}

	@Override
	public Product findByID(String productID) {
		Product product = productRepo.findById(productID).get();
		return product;
	}

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

}
