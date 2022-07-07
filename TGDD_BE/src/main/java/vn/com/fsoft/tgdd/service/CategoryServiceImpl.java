package vn.com.fsoft.tgdd.service;

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
	public void delete(int categoryID) {
		Category cate = cateRepo.findById(categoryID).get();
		cate.setStatus(false);
		cateRepo.save(cate);
	}

	@Override
	public Category findByID(int categoryID) {

		return cateRepo.findById(categoryID).get();
	}


	@Override
	public List<Category> findAll() {
		List<Category> ListCate = cateRepo.findAll();
		return ListCate;
	}
}
