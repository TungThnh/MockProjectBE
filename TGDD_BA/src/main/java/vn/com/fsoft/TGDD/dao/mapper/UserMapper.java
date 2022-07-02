package vn.com.fsoft.TGDD.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import vn.com.fsoft.TGDD.entity.Account;

public class UserMapper implements RowMapper<Account> {

    public static final String SQL = "Select u.user_id, u.user_name, u.full_name, u.password From admin u ";

    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer userID = rs.getInt("user_id");
        String userName = rs.getString("user_name");
        String fullName = rs.getString("full_name");
        String password = rs.getString("password");
        return new Account(userID, userName, fullName, password);
    }
}
