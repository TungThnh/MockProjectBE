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
	
	@GetMapping("homes")
	public ResponseEntity<?> getHomeProduct() {
		List<Product> listProduct = proService.findAll();
		return ResponseEntity.ok(listProduct);
	}
	
	@GetMapping("home-phone")
	public ResponseEntity<?> getPhoneProduct() {
		List<Product> listProduct = proService.findByCategoryID(2);
		return ResponseEntity.ok(listProduct);
	}
	
	@GetMapping("home-laptop-tablet")
	public ResponseEntity<?> getLapTabProduct() {
		List<Product> listProductLap = proService.findByCategoryID(1);
		List<Product> listProductTab = proService.findByCategoryID(6);
		listProductLap.addAll(listProductTab);
		return ResponseEntity.ok(listProductLap);
	}
	
	
	@GetMapping("home-accessory")
	public ResponseEntity<?> getAccessory() {
		List<Product> listProductHeadPhone = proService.findByCategoryID(4);
		List<Product> listProductMouse = proService.findByCategoryID(5);
		listProductHeadPhone.addAll(listProductMouse);
		return ResponseEntity.ok(listProductHeadPhone);
	}
	
	@GetMapping("home-watch")
	public ResponseEntity<?> getWatchProduct() {
		List<Product> listProduct = proService.findByCategoryID(7);
		return ResponseEntity.ok(listProduct);
	}
	

}
