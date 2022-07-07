package vn.com.fsoft.tgdd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import vn.com.fsoft.tgdd.dao.mapper.UserMapper;
import vn.com.fsoft.tgdd.entity.Admin;

import javax.sql.DataSource;
import java.util.Collection;

@Repository
public class AccountDAO extends JdbcDaoSupport {
    @Autowired
    public AccountDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public Admin findUserAccount(String userName) {
        String sql = UserMapper.SQL + " where u.user_name = ? ";
        Object[] params = new Object[]{userName};
        UserMapper mapper = new UserMapper();
        try {
            Admin usersInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
            return usersInfo;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
