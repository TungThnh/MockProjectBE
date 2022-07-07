package vn.com.fsoft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

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
        ResponseEntity<String> response
          = restTemplate.getForEntity(fooResourceUrl, String.class);
        model.addAttribute("productDTO", response.getBody());
        return "test";
    }
    
}
