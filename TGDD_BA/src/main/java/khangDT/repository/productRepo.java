package khangDT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import khangDT.entity.product;

@Repository
public interface productRepo extends JpaRepository<product, String>{

}
