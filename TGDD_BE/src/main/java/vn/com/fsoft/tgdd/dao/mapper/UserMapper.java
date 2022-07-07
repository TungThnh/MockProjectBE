package vn.com.fsoft.tgdd.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vn.com.fsoft.tgdd.entity.Admin;

public class UserMapper implements RowMapper<Admin> {

    public static final String SQL = "Select u.user_id, u.user_name, u.full_name, u.password From Admin u ";

    @Override
    public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer userID = rs.getInt("user_id");
        String userName = rs.getString("user_name");
        String fullName = rs.getString("full_name");
        String password = rs.getString("password");
        return new Admin(userID, userName, fullName, password);
    }
}
