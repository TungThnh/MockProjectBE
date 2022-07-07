package fa.group4.MockProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.group4.MockProject.entity.orders;

public interface orderRepo extends JpaRepository<orders, String>{

}
