package vn.com.fsoft.tgdd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.fsoft.tgdd.entity.Product;
import vn.com.fsoft.tgdd.service.ProductService;

@RestController
public class HomeController {
	@Autowired
	ProductService proService;
	
	//@GetMapping("home-discount-product")
	
	
	
	@GetMapping("home-phone")
	public ResponseEntity<?> getPhoneProduct() {
		List<Product> listProduct = proService.findAllByCategory(2);
		return ResponseEntity.ok(listProduct);
	}
	
	@GetMapping("home-laptop-tablet")
	public ResponseEntity<?> getLapTabProduct() {
		List<Product> listProductLap = proService.findAllByCategory(1);
		List<Product> listProductTab = proService.findAllByCategory(6);
		listProductLap.addAll(listProductTab);
		return ResponseEntity.ok(listProductLap);
	}
	
	
	@GetMapping("home-accessory")
	public ResponseEntity<?> getAccessory() {
		List<Product> listProductHeadPhone = proService.findAllByCategory(4);
		List<Product> listProductMouse = proService.findAllByCategory(5);
		listProductHeadPhone.addAll(listProductMouse);
		return ResponseEntity.ok(listProductHeadPhone);
	}
	
	@GetMapping("home-watch")
	public ResponseEntity<?> getWatchProduct() {
		List<Product> listProduct = proService.findAllByCategory(7);
		return ResponseEntity.ok(listProduct);
	}
	

}
