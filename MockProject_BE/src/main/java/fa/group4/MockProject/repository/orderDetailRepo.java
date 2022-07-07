package fa.group4.MockProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.group4.MockProject.entity.orderdetails;

public interface orderDetailRepo extends JpaRepository<orderdetails, String>{

}
