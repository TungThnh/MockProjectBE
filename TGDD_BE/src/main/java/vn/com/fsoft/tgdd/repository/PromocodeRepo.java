package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.fsoft.tgdd.entity.PromoCode;

public interface PromocodeRepo extends JpaRepository<PromoCode, String> {

}
