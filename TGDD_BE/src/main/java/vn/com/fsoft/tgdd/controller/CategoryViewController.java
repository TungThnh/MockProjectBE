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

import vn.com.fsoft.tgdd.entity.Category;
import vn.com.fsoft.tgdd.entity.Product;
import vn.com.fsoft.tgdd.service.CategoryService;
import vn.com.fsoft.tgdd.service.ProductService;

@RestController
@RequestMapping("category")
public class CategoryViewController {
	@Autowired
	ProductService proService;
	
	@Autowired
	CategoryService cateService;

	@GetMapping("/{categoryId}")
	public ResponseEntity<?> getListProductByCategory(@PathVariable String categoryId) {
		List<Product> listProduct = proService.findByCategoryID(categoryId);
		List<Category> listCate = cateService.getAllCateSub(categoryId);
		for (int i = 0 ; i < listCate.size(); i++) {
			listProduct.addAll(proService.findByCategoryID(listCate.get(i).getCategoryID()));
		}
 		return ResponseEntity.ok(listProduct);
	}

	
	/*
	 * @GetMapping("/{id}")
	public ResponseEntity<?> getListProductByCategory(@PathVariable String id) {
		List<Product> listProduct = proService.findByCategoryID(id);
		return ResponseEntity.ok(listProduct);
	}
	 */
}
