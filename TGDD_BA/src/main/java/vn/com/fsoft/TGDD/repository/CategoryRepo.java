package vn.com.fsoft.TGDD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.TGDD.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
