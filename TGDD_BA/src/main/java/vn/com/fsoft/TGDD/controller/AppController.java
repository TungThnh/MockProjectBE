package vn.com.fsoft.TGDD.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import vn.com.fsoft.TGDD.entity.Category;
import vn.com.fsoft.TGDD.entity.Product;
import vn.com.fsoft.TGDD.repository.CategoryRepo;
import vn.com.fsoft.TGDD.repository.ProductRepo;

@Controller
@MultipartConfig
public class AppController {

	@Autowired
	CategoryRepo cateRepo;

	@Autowired
	ProductRepo productRepo;

	@GetMapping({ "/", "/home" })
	public String loadHome() {
		return "home";
	}
	
	@GetMapping("/testa")
	public String testa() {
		String a = System.getProperty("user.dir");
		return a;
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
		decodeMethod(Lproduct);
		model.addAttribute("product", Lproduct);
		return "product";
	}
	/////////// Add product /////////
	
	@GetMapping("/addProductPage")
	public String loadAddProductPage(Product product,Model model) {
		List<Category> ListCate = cateRepo.findAll();
		model.addAttribute("list_cate", ListCate);
		model.addAttribute("product_form", product);
		return "addProductPage";
	}
	@PostMapping("/saveProduct")
	public String saveNewProduct(Model model, @ModelAttribute("product") Product pro) throws IOException {
		Product imageEncodeProduct = encodeMethod(pro);
		imageEncodeProduct.setStatus(true);
		productRepo.save(imageEncodeProduct);
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

	@RequestMapping("/saveEditProduct")
	public String saveProduct(Model model, @ModelAttribute("product") Product pro) throws IOException {
		Product imageEncodeProduct = encodeMethod(pro);
		productRepo.save(imageEncodeProduct);
		List<Product> Lproduct = productRepo.findAll();
		model.addAttribute("product", Lproduct);
		
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
	
	//Decode image//
	
	String subPath = "/static/image/";
	
	public void decodeMethod(List<Product> list) {
		String encodedImgLink = "";
		String decodedImgLink = "";
		for (Product product : list) {
			encodedImgLink = product.getImagelink();
			byte[] decodedBytes = Base64.getDecoder().decode(encodedImgLink);
			decodedImgLink = new String(decodedBytes);
			System.out.println("aaa: "+ decodedImgLink);
			String finalLink = decodedImgLink.substring(decodedImgLink.indexOf("static") - 1);
			System.out.println("File name decoded:" + finalLink);
			product.setImagelink(finalLink);
		}

	}
	public Product encodeMethod(Product product) throws IOException {
		String imglink = product.getImagelink();
		String newimgLink = editAndDecodeImgLink(imglink);
		System.out.println("new img link: "+ newimgLink);
		String finalDecodedLink = Base64.getEncoder().encodeToString(newimgLink.getBytes());
		product.setImagelink(finalDecodedLink);
		return product;
	}
	public String editAndDecodeImgLink(String imgLink) throws IOException {
		String imgpath = subPath + imgLink;
		String editedImglink = "";
		
		try {
			File filepath = new ClassPathResource(imgpath).getFile();
			editedImglink = filepath.getAbsolutePath();
			System.out.println("File name:" + imgLink + " location:" + editedImglink);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return editedImglink;
	}
	
	
	/////Login//////
	@GetMapping("/login")
	public String loginPage(){
		return "loginPage";
	}

	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model) {
		return "redirect:/";
	}

}
