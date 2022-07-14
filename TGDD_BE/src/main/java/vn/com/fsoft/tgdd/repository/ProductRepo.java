package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.tgdd.entity.Product;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, String>{
//    @Query("SELECT p " +
//            "FROM Product p INNER JOIN Category c ON p.categoryID = c.categoryID INNER JOIN Brand b ON p.brandID = b.brandID " +
//            "WHERE c.categoryName LIKE %?1% OR p.productName LIKE %?1% OR b.brandName LIKE %?1%")

    @Query("SELECT p " +
            "FROM Product p INNER JOIN Category c ON p.categoryID = c.categoryID INNER JOIN Brand b ON p.brand = b.brandID " +
            "WHERE c.categoryName LIKE %?1% OR p.productName LIKE %?1% OR b.brandName LIKE %?1%")
    public List<Product> findProductByKeyword(String keyword);
    
    @Query("SELECT p "+
    		"FROM Product p WHERE p.categoryID = ?1")
    public List<Product> findByCategoryID(Integer categoryID);
    @Query("SELECT p "+
    		"FROM Product p WHERE p.brand = ?1")
    public List<Product> findByBrand(Integer brand);
}
