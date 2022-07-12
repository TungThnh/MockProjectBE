package vn.com.fsoft.tgdd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.fsoft.tgdd.entity.Product;
import vn.com.fsoft.tgdd.service.ProductService;

@RestController
@RequestMapping("category")
public class CategoryViewController {
	@Autowired
	ProductService proService;

	@GetMapping("/{id}")
	public ResponseEntity<?> getListProductByCategory(@PathVariable int id) {
		List<Product> listProduct = proService.findAllByCategory(id);
		return ResponseEntity.ok(listProduct);
	}
	
	@GetMapping("/laptop-ldp")
	void handleLaptop(HttpServletResponse response) throws IOException {
	    response.sendRedirect("1/");
	  }

	@GetMapping("/dien-thoai")
	void handlePhone(HttpServletResponse response) throws IOException {
	    response.sendRedirect("2/");
	  }

	@GetMapping("/may-tinh-bang")
	void handleTab(HttpServletResponse response) throws IOException {
	    response.sendRedirect("6/");
	  }
}
