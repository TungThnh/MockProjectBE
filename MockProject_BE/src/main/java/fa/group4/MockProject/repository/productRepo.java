package fa.group4.MockProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.group4.MockProject.entity.products;

public interface productRepo extends JpaRepository<products, String>{

}
