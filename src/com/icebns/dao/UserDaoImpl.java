package com.icebns.dao;

import com.icebns.pojo.User;
import com.icebns.service.UserService;
import com.icebns.utils.JdbcUtils;
import com.icebns.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    public User getUser(String userName, String password, Integer userType){
        return JdbcUtils.queryOne("select * from user where user_name=?and password=?and user_type=?", new RowMap<User>(){
            @Override
            public User rowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setRealName(rs.getString("real_name"));
                    user.setId(rs.getInt("id"));
                    user.setUserName(rs.getString("user_name"));
                    user.setPassword(rs.getString("password"));
                    user.setUserType(rs.getInt("user_type"));
                    user.setDocTitleid(rs.getInt("doc_titleid"));
                    user.setIsScheduling(rs.getString("is_scheduling"));
                    user.setDeptId(rs.getInt("dept_id"));
                    user.setRegistLeid(rs.getInt("regist_leid"));
                    user.setDelMark(rs.getInt("del_mark"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, userName,password,userType);

    }

    @Override
    public User getUserByUsername(String username) {
        return JdbcUtils.queryOne("select * from user where user_name=?", new RowMap<User>(){
            @Override
            public User rowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setId(rs.getInt("id"));
                    user.setUserName(rs.getString("user_name"));
                    user.setPassword(rs.getString("password"));
                    user.setUserType(rs.getInt("user_type"));
                    user.setDocTitleid(rs.getInt("doc_titleid"));
                    user.setIsScheduling(rs.getString("is_scheduling"));
                    user.setDeptId(rs.getInt("dept_id"));
                    user.setRegistLeid(rs.getInt("regist_leid"));
                    user.setDelMark(rs.getInt("del_mark"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, username);

    }
}
