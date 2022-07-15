package vn.com.fsoft.tgdd.service;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import vn.com.fsoft.tgdd.entity.Product;
import vn.com.fsoft.tgdd.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Override
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public void saveProduct(Product product) {
		productRepo.save(product);
	}

	@Override
	public void deleteProduct(String productID) {
		Product product = productRepo.findById(productID).get();
		product.setStatus(false);
		productRepo.save(product);
	}

	@Override
	public Product findByID(String productID) {
		Product product = productRepo.findById(productID).get();
		return product;
	}
	
	@Override
	public List<Product> findAll() {
		List<Product> listProduct = productRepo.findAll();
//		decodeMethod(listProduct);
		return listProduct;
	}

	@Override
	public List<Product> listAll(String keyword) {
		List<Product> listProduct = productRepo.findProductByKeyword(keyword);
//		decodeMethod(listProduct);
		if(keyword != null) {
			return listProduct;
		}
		return productRepo.findAll();
	}

	// Decode image//

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

	@Override
	public List<Product> findByCategoryID(String categoryID) {
		List<Product> product = productRepo.findByCategoryID(categoryID);
		return product;
	}

	@Override
	public List<Product> findByBrandID(Integer brandID) {
		List<Product> product = productRepo.findByBrand(brandID);
		return product;
	}

}
