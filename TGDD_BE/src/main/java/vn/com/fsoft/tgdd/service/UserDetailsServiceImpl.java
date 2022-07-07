package vn.com.fsoft.tgdd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import vn.com.fsoft.tgdd.dao.AccountDAO;
import vn.com.fsoft.tgdd.dao.AccountPrincipal;
import vn.com.fsoft.tgdd.entity.Admin;
import vn.com.fsoft.tgdd.repository.AdminRepo;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    public AdminRepo accountRepo;

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // đầu tiên mình query xuống database xem có user  đó không
        Admin account = this.accountDAO.findUserAccount(userName);
        //Nếu không tìm thấy User thì mình thông báo lỗi
        if (account == null) {
            System.out.println("Admin " + userName + " was not found in the database");
            throw new UsernameNotFoundException("Admin " + userName + " was not found in the database");
        }
        //UserDetails userDetails = (UserDetails) new Admin(account.getUserName(),account.getPassword());
        return new AccountPrincipal(account);
    }
}

