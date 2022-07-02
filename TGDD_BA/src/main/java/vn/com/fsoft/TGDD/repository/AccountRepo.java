package vn.com.fsoft.TGDD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.fsoft.TGDD.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {
    Account findByUserName(String userName);
}
