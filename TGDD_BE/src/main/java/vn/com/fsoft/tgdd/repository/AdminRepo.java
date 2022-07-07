package vn.com.fsoft.tgdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.com.fsoft.tgdd.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
    Admin findByUserName(String userName);
}
