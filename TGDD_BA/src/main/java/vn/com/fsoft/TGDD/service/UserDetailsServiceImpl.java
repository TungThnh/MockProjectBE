package vn.com.fsoft.TGDD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import vn.com.fsoft.TGDD.dao.AccountDAO;
import vn.com.fsoft.TGDD.dao.AccountPrincipal;
import vn.com.fsoft.TGDD.entity.Account;
import vn.com.fsoft.TGDD.repository.AccountRepo;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    public AccountRepo accountRepo;

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // đầu tiên mình query xuống database xem có user  đó không
        Account account = this.accountDAO.findUserAccount(userName);
        //Nếu không tìm thấy User thì mình thông báo lỗi
        if (account == null) {
            System.out.println("Account " + userName + " was not found in the database");
            throw new UsernameNotFoundException("Account " + userName + " was not found in the database");
        }
        //UserDetails userDetails = (UserDetails) new Account(account.getUserName(),account.getPassword());
        return new AccountPrincipal(account);
    }
}

