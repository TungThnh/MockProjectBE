package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.fsoft.tgdd.entity.OrderDetails;

public interface OrderDetailRepo extends JpaRepository<OrderDetails, String>{

}
