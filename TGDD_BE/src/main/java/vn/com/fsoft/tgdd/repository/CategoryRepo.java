package vn.com.fsoft.tgdd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.tgdd.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String>{
	
	 @Query("SELECT c "+ "FROM Category c WHERE c.categoryID = ?1") 
	 public Category findByCateID(String categoryID);
	 
	 @Query("SELECT c "+ "FROM Category c WHERE c.categoryParent = ?1") 
	 public List<Category> findAllByCateParent (String categoryParent);
	 
}
