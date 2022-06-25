package vn.com.fsoft.TGDD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.TGDD.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String>{

}
