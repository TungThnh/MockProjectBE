package khangDT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import khangDT.entity.category;
import khangDT.entity.product;
import khangDT.repository.categoryRepo;
import khangDT.repository.productRepo;

@Controller
public class AppController {

	@Autowired
	categoryRepo cateRepo;

	@Autowired
	productRepo productRepo;
	
	@GetMapping({ "/", "/home" })
	public String loadHome() {
		return "home";
	}

	////// category/////////

	@GetMapping("/test")
	public List<category> test() {
		return cateRepo.findAll();
	}

	@GetMapping("/getAllCate")
	public String getAllCate(Model model) {
		List<category> Lcate = cateRepo.findAll();
		model.addAttribute("category", Lcate);
		return "category";
	}
	//Add Cate////
	
	@GetMapping("/addCatePage")
	public String LoadAddCate(category cate, Model model) {

		model.addAttribute("cate", cate);
		return "category";
	}
	
	
	@GetMapping("/addCate")
	public String addCate(category cate, Model model) {
		cate.setStatus(true);
		cateRepo.save(cate);

		List<category> Lcate = cateRepo.findAll();
		model.addAttribute("category", Lcate);
		return "category";
	}

	// Edit cate

	@GetMapping("/editCatePage/{categoryID}")
	public String loadEditPage(@PathVariable(name = "categoryID") int id, Model model) {

		category cate = cateRepo.findById(id).get();
		model.addAttribute("category", cate);

		return "editCatePage";
	}

	@PostMapping("/saveEditCate")
	public String saveCate(category cate, Model model) {
		cateRepo.save(cate);

		List<category> LCate = cateRepo.findAll();
		model.addAttribute("category", LCate);
		return "category";
	}

	@GetMapping("/deleteCate/{categoryID}")
	public String deleteCate(@PathVariable(name = "categoryID") int id, Model model) {
		category cate = cateRepo.findById(id).get();
		cate.setStatus(false);
		cateRepo.save(cate);

		List<category> LCate = cateRepo.findAll();
		model.addAttribute("category", LCate);
		return "category";
	}
////////////////////////////////////Product ////////////////////////////////////////


	@GetMapping("/getAllProduct")
	public String getAllProduct(Model model) {
		List<product> Lproduct = productRepo.findAll();
		model.addAttribute("product", Lproduct);
		return "product";
	}
	
	///////////Edit product/////////

	@GetMapping("/editProductPage/{productID}")
	public String loadProductPage(@PathVariable(name = "productID") String id, Model model) {

		product pro = productRepo.findById(id).get();
		model.addAttribute("product", pro);

		return "editProductPage";
	}

	@PostMapping("/saveEditProduct")
	public String saveProduct(product pro, Model model) {
		productRepo.save(pro);

		List<product> Lproduct = productRepo.findAll();
		model.addAttribute("category", Lproduct);
		return "product";
	}
	@GetMapping("/deleteProduct/{categoryID}")
	public String deleteProduct(@PathVariable(name = "categoryID") int id, Model model) {
		category cate = cateRepo.findById(id).get();
		cate.setStatus(false);
		cateRepo.save(cate);

		List<category> LCate = cateRepo.findAll();
		model.addAttribute("category", LCate);
		return "category";
	}
	
	
}
