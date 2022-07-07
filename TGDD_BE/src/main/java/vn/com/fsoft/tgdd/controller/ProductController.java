package vn.com.fsoft.tgdd.controller;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.fsoft.tgdd.entity.Category;
import vn.com.fsoft.tgdd.entity.Product;
import vn.com.fsoft.tgdd.service.CategoryService;
import vn.com.fsoft.tgdd.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService proService;
	
	@Autowired
	CategoryService cateService;;
////////////////////////////////////Product ////////////////////////////////////////

	@GetMapping("/get-all-product")
	public String getAllistProduct(Model model) {
		List<Product> listProduct = proService.findAll();
		decodeMethod(listProduct);
		model.addAttribute("product", listProduct);
		return "product";
	}
/////////// Add product /////////

	@GetMapping("/add-product-page")
	public String loadAddProductPage(Product product, Model model) {
		List<Category> ListCate = cateService.findAll();
		model.addAttribute("listCate", ListCate);
		model.addAttribute("product-form", product);
		return "add-product";
	}

	@PostMapping("/save-product")
	public String saveNewProduct(Model model, @ModelAttribute("product") Product pro) throws IOException {
		Product imageEncodeProduct = encodeMethod(pro);
		imageEncodeProduct.setStatus(true);
		proService.saveProduct(imageEncodeProduct);
		List<Product> listProduct = proService.findAll();
		model.addAttribute("product", listProduct);
		return "product";
	}

/////////// Edit product/////////

	@GetMapping("/edit-product-page/{productID}")
	public String loadProductPage(@PathVariable(name = "productID") String id, Model model) {
		Product pro = proService.findByID(id);
		model.addAttribute("product", pro);

		return "editProductPage";
	}

	@RequestMapping("/save-edit-product")
	public String saveProduct(Model model, @ModelAttribute("product") Product pro) throws IOException {
		Product imageEncodeProduct = encodeMethod(pro);
		proService.saveProduct(imageEncodeProduct);
		List<Product> listProduct = proService.findAll();
		model.addAttribute("product", listProduct);

		return "product";
	}

	@GetMapping("/delete-product/{productID}")
	public String deleteProduct(@PathVariable(name = "productID") String id, Model model) {
		Product pro = proService.findByID(id);
		pro.setStatus(false);
		proService.saveProduct(pro);

		List<Product> ListProduct= proService.findAll();
		model.addAttribute("Product", ListProduct);
		return "product";

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
			System.out.println("aaa: " + decodedImgLink);
			String finalLink = decodedImgLink.substring(decodedImgLink.indexOf("static") - 1);
			System.out.println("File name decoded:" + finalLink);
			product.setImagelink(finalLink);
		}

	}

	public Product encodeMethod(Product product) throws IOException {
		String imglink = product.getImagelink();
		String newimgLink = editAndDecodeImgLink(imglink);
		System.out.println("new img link: " + newimgLink);
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

}
