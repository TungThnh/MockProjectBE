package vn.com.fsoft.TGDD.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import vn.com.fsoft.TGDD.entity.Category;
import vn.com.fsoft.TGDD.entity.Product;
import vn.com.fsoft.TGDD.repository.CategoryRepo;
import vn.com.fsoft.TGDD.repository.ProductRepo;

@Controller
public class AppController {

	@Autowired
	CategoryRepo cateRepo;

	@Autowired
	ProductRepo productRepo;

	@GetMapping({ "/", "/home" })
	public String loadHome() {
		return "home";
	}

	////// category/////////

	@GetMapping("/test")
	public List<Category> test() {
		return cateRepo.findAll();
	}

	@GetMapping("/getAllCateAD")
	public String getAllCateAD(Model model) {
		List<Category> Lcate = cateRepo.findAll();
		model.addAttribute("category", Lcate);
		return "categoryAD";
	}
	
	@GetMapping("/getAllCateUS")
	public String getAllCateUS(Model model) {
		List<Category> Lcate = cateRepo.findAll();
		List<Category> LcateUS = new ArrayList<>();
		for (int i = 0; i < Lcate.size(); i++) {
			if(Lcate.get(i).isStatus() == true) {
				LcateUS.add(Lcate.get(i));
			}
		}
		model.addAttribute("category", LcateUS);
		return "categoryUS";
	}
	// Add Cate////

	@GetMapping("/addCatePage")
	public String LoadAddCate(Category cate, Model model) {
		model.addAttribute("cate", cate);
		return "addCatePage";
	}

	@GetMapping("/addCate")
	public String addCate(Category cate, Model model) {
		try {
			cate.setStatus(true);
			cateRepo.save(cate);
		} catch (Exception e) {
			model.addAttribute("msg", "category name already exist");
		}
		
		
		List<Category> Lcate = cateRepo.findAll();
		model.addAttribute("category", Lcate);
		return "categoryAD";
		
	}

	// Edit cate

	@GetMapping("/editCatePage/{categoryID}")
	public String loadEditPage(@PathVariable(name = "categoryID") int id, Model model) {

		Category cate = cateRepo.findById(id).get();
		model.addAttribute("category", cate);

		return "editCatePage";
	}

	@PostMapping("/saveEditCate")
	public String saveCate(Category cate, Model model) {
		try {
			cateRepo.save(cate);
			model.addAttribute("msg", "Edit category success");
		} catch (Exception e) {
			model.addAttribute("msg", "Error at edit category");
		}

		List<Category> LCate = cateRepo.findAll();
		model.addAttribute("category", LCate);
		return "categoryAD";
	}

	@GetMapping("/deleteCate/{categoryID}")
	public String deleteCate(@PathVariable(name = "categoryID") int id, Model model) {
		try {
			Category cate = cateRepo.findById(id).get();
			cate.setStatus(false);
			cateRepo.save(cate);
			model.addAttribute("msg", "Deactivate category success");
		} catch (Exception e) {
			model.addAttribute("msg", "Error at delete category");
		}

		List<Category> LCate = cateRepo.findAll();
		model.addAttribute("category", LCate);
		return "categoryAD";
	}
////////////////////////////////////Product ////////////////////////////////////////

	@GetMapping("/getAllProduct")
	public String getAllProduct(Model model) {
		List<Product> Lproduct = productRepo.findAll();
		model.addAttribute("product", Lproduct);
		return "product";
	}

	/////////// Edit product/////////

	@GetMapping("/editProductPage/{productID}")
	public String loadProductPage(@PathVariable(name = "productID") String id, Model model) {

		Product pro = productRepo.findById(id).get();
		model.addAttribute("product", pro);

		return "editProductPage";
	}

	@PostMapping("/saveEditProduct")
	public String saveProduct(Product pro, Model model) {
		productRepo.save(pro);

		List<Product> Lproduct = productRepo.findAll();
		model.addAttribute("category", Lproduct);
		return "product";
	}

	@GetMapping("/deleteProduct/{categoryID}")
	public String deleteProduct(@PathVariable(name = "categoryID") int id, Model model) {
		Category cate = cateRepo.findById(id).get();
		cate.setStatus(false);
		cateRepo.save(cate);

		List<Category> LCate = cateRepo.findAll();
		model.addAttribute("category", LCate);
		return "category";
	}

}
