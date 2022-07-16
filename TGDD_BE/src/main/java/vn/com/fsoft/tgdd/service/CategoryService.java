package vn.com.fsoft.tgdd.service;

import java.util.List;

import vn.com.fsoft.tgdd.entity.Category;

public interface CategoryService {

    Category create(Category category);

    void save(Category category);

    void delete(String categoryID);

    Category findByID(String categoryID);

    List<Category> findAll();
    
    List<Category> getAllCateSub(String categoryID);
    
    List<Category> findAllByCateParent(String categoryParent);
}
