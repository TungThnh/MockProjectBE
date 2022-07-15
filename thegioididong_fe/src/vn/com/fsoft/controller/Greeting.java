package vn.com.fsoft.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import vn.com.fsoft.entity.Product;

@Controller
public class Greeting {
    
    @RequestMapping(value = "/index")
    public String index(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8001/greeting";
        ResponseEntity<String> response
          = restTemplate.getForEntity(fooResourceUrl, String.class);
        model.addAttribute("text", response.getBody());
        return "index";
    }
    
    @RequestMapping(value = "/add-product-page")
    public String LoadAddProductPage(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8070/testa";
        ResponseEntity<Product> response
          = restTemplate.getForEntity(fooResourceUrl, Product.class);
        model.addAttribute("productDTO", response.getBody());
        return "test";
    }
    
    @GetMapping(value = {"/","/home"})
    public String home(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/homes";
        ResponseEntity<Product[]> respone = restTemplate.getForEntity(resourceUrl, Product[].class);
        Product[] product = respone.getBody();
        System.out.println("product :"+ product);
        model.addAttribute("product",product);
    	return "home";
    }
    
    @GetMapping(value = "/get-vivo")
    public String getVivo(Model model) {
    	RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/product/get-vivo";
        ResponseEntity<Product[]> respone = restTemplate.getForEntity(resourceUrl, Product[].class);
        Product[] product = respone.getBody();
        model.addAttribute("product",product);
    	return "product";
    }
    

    @GetMapping(value = "/get-detail/{productID}")
    public String getProductById(Model model,@PathVariable String productID) {
    	RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/product/get-product-by-id/" + productID;
        ResponseEntity<Product> respone = restTemplate.getForEntity(resourceUrl, Product.class);
        Product product = respone.getBody();
        model.addAttribute("product",product);
    	return "product";
    }
    
    // da test ///
    @RequestMapping(value = "/getall")
    public String getAll(Model model){
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/product/test";
        ResponseEntity<Product[]> respone = restTemplate.getForEntity(resourceUrl, Product[].class);
        Product[] product = respone.getBody();
        System.out.println("product :"+ product);
        model.addAttribute("product",product);
    	return "test";
    }

    @PostMapping(value = "/add-category") 
    public Category addCate() {
    	Category cate = New Category();
    	cate.ser
    }
    
}
