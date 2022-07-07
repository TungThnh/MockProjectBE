package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.tgdd.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
