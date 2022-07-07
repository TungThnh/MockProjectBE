package vn.com.fsoft.tgdd.service;

import java.util.List;

import vn.com.fsoft.tgdd.entity.Category;

public interface CategoryService {

    Category create(Category category);

    void save(Category category);

    void delete(int categoryID);

    Category findByID(int categoryID);

    List<Category> findAll();
}
