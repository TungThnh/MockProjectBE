package vn.com.fsoft.tgdd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.fsoft.tgdd.entity.Category;
import vn.com.fsoft.tgdd.service.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {
	
	@Autowired
	CategoryService cateService;

//////category/////////

	@GetMapping("/test")
	public List<Category> test() {
		return cateService.findAll();
	}

	@GetMapping("/get-all-cate-ad")
	public String getAllistCateAD(Model model) {
		List<Category> listCate = cateService.findAll();
		model.addAttribute("category", listCate);
		return "categoryAD";
	}

	@GetMapping("/get-all-cate-us")
	public String getAllistCateUS(Model model) {
		List<Category> listCate = cateService.findAll();
		List<Category> listCateUs = new ArrayList<>();
		try {
			for (int i = 0; i < listCate.size(); i++) {
				if (listCate.get(i).isStatus() == true) {
					listCateUs.add(listCate.get(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("category", listCateUs);
		return "categoryUS";
	}
	///// Add Cate////

	@GetMapping("/add-cate-page")
	public String LoadAddCate(Category cate, Model model) {
		model.addAttribute("cate", cate);
		return "addCatePage";
	}

	@GetMapping("/add-cate")
	public String addCate(Category cate, Model model) {
		try {
			cate.setStatus(true);
			cateService.save(cate);
		} catch (Exception e) {
			model.addAttribute("msg", "category name already exist");
		}

		List<Category> listCate = cateService.findAll();
		model.addAttribute("category", listCate);
		return "categoryAD";

	}

	// Edit cate

	@GetMapping("/edit-cate-page/{categoryID}")
	public String loadEditPage(@PathVariable(name = "categoryID") int id, Model model) {

		Category cate = cateService.findByID(id);
		model.addAttribute("category", cate);

		return "editCatePage";
	}

	@PostMapping("/save-edit-cate")
	public String saveCate(Category cate, Model model) {
		try {
			cateService.save(cate);
			model.addAttribute("msg", "Edit category success");
		} catch (Exception e) {
			model.addAttribute("msg", "Error at edit category");
		}

		List<Category> listCate = cateService.findAll();
		model.addAttribute("category", listCate);
		return "categoryAD";
	}

	@GetMapping("/delete-cate/{categoryID}")
	public String deleteCate(@PathVariable(name = "categoryID") int id, Model model) {
		try {
			Category cate = cateService.findByID(id);
			cate.setStatus(false);
			cateService.save(cate);
			model.addAttribute("msg", "Deactivate category success");
		} catch (Exception e) {
			model.addAttribute("msg", "Error at delete category");
		}

		List<Category> listCate = cateService.findAll();
		model.addAttribute("category", listCate);
		return "categoryAD";
	}
}
