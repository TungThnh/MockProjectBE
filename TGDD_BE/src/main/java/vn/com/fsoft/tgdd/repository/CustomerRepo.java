package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.fsoft.tgdd.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
