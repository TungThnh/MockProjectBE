package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.tgdd.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String>{

}
