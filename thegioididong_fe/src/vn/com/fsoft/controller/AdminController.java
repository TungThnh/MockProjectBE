package vn.com.fsoft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import vn.com.fsoft.entity.Product;

@Controller
@RequestMapping("admin")
public class AdminController {

	@GetMapping(value = {"/","/home"})
	public String adminHome(Model model) {
		return "admin-page";
	}
	
	@RequestMapping(value = "/add-product-page")
	public String addProductPage(Model model, Product product) {
		model.addAttribute("product", product);
		return "add-product";
	}
	
	@RequestMapping(value = "/list-product-page")
	public String listProductPage(Model model) {
		RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/product/get-product";
        ResponseEntity<Product[]> respone = restTemplate.getForEntity(resourceUrl, Product[].class);
        Product[] product = respone.getBody();
        model.addAttribute("product",product);
		return "product-list";
	}
	
	
	
    @GetMapping(value = "/add-product")
    public String addProduct(Model model) {
    	RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/product/get-vivo";
        ResponseEntity<Product[]> respone = restTemplate.getForEntity(resourceUrl, Product[].class);
        Product[] product = respone.getBody();
        model.addAttribute("product",product);
    	return "product";
    }
}
