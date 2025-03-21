package com.revature.repos;

import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User create(User obj) {
        return null;
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers = new ArrayList<>();
        Connection conn = ConnectionUtil.getConnection();
        String sql = "Select * from Users;";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()){
                User u =new User();
                u.setUserId(rs.getInt("user_id"));
                u.setFirstName(rs.getString("first_name"));
                u.setLastName(rs.getString("last_name"));
                u.setUsername(rs.getString("email"));
                u.setRole(Role.valueOf(rs.getString("roles")));
                allUsers.add(u);


            }

        } catch (SQLException e) {
            System.out.println("could not get all users");
            e.printStackTrace();
        }


        return allUsers;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public User update(User obj) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
