package fa.group4.MockProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.group4.MockProject.entity.productspecification;

public interface productspecRepo extends JpaRepository<productspecification, String>{

}
