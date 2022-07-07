package fa.group4.MockProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.group4.MockProject.entity.customer;

public interface customerRepo extends JpaRepository<customer, String>{

}
