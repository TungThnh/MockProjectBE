package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.fsoft.tgdd.entity.Orders;


public interface OrderRepo extends JpaRepository<Orders, String>{

}
