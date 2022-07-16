package vn.com.fsoft.tgdd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.fsoft.tgdd.entity.Category;
import vn.com.fsoft.tgdd.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo cateRepo;

	@Override
	public Category create(Category category) {

		return cateRepo.save(category);
	}

	@Override
	public void save(Category category) {
		cateRepo.save(category);
	}

	@Override
	public void delete(String categoryID) {
		Category cate = cateRepo.findById(categoryID).get();
		cate.setStatus(false);
		cateRepo.save(cate);
	}

	@Override
	public Category findByID(String categoryID) {
		return cateRepo.findByCateID(categoryID);
	}

	// lay tat ca cac category co cung parent
	@Override
	public List<Category> findAllByCateParent(String categoryParent) {
		List<Category> listCate = cateRepo.findAllByCateParent(categoryParent);
		return listCate;
	}

	// lay tat ca cac category con cua category cha
	public List<Category> getAllCateSub(String categoryID) {
		List<Category> listCate = new ArrayList<>();
		//listCate.add((Category) findByID(categoryID));
		List<Category> listCate1 = (List<Category>) findAllByCateParent(categoryID);
		while (listCate1.isEmpty() == false) {
			listCate.add(listCate1.get(0));
			//List<Category> listCate2 = cateRepo.findAllByCateParent(listCate1.get(0).getCategoryID());
			listCate1.addAll((List<Category>)findAllByCateParent(listCate1.get(0).getCategoryID()));
			listCate1.remove(0);
		}
		return listCate;
	}

	@Override
	public List<Category> findAll() {
		List<Category> ListCate = cateRepo.findAll();
		return ListCate;
	}
}
