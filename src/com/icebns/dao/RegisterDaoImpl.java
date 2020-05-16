package com.icebns.dao;

import com.icebns.pojo.Register;
import com.icebns.utils.JdbcUtils;
import com.icebns.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RegisterDaoImpl implements RegisterDao{

    @Override
    public int add(Register register) {
//        return JdbcUtils.excuteUpdate("insert into `register`(`case_number`) value(?)",register.getCaseNumber());
        return JdbcUtils.excuteUpdate("insert into `test`.`register`(`case_number`, `real_name`, `gender`, `id_number`, `birth_date`, `age`," +
                        " `age_type`, `home_address`, `visit_date`, `noon`, `dept_id`, `user_id`, `regist_leid`, `settle_id`, `is_book`, `regist_time`," +
                        " `register_id`, `visit_state`) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, 2)",register.getCaseNumber(), register.getRealName(),register.getGender(),
                register.getIdNumber(),register.getBirthDate(), register.getAge(), register.getAgeType(), register.getHomeAddress(), register.getVisitDate(), register.getNoon(), register.getDeptId(),
                register.getUserId(), register.getRegistLeid(), register.getSettleId(), register.getIsBook(),register.getRegistTime(),register.getRegisterId());
//        return 0;
    }



    @Override
    public Register getOne(String caseNumber) {
        return JdbcUtils.queryOne("select * from `register` where case_number=?", new RowMap<Register>() {
            @Override
            public Register rowMapping(ResultSet rs) {
                Register register = new Register();
                try {
                    register.setRealName(rs.getString("real_name"));
                    register.setHomeAddress(rs.getString("home_address"));
                    register.setIdNumber(rs.getString("id_number"));
                    register.setVisitState(rs.getInt("visit_state"));
                    register.setCaseNumber(rs.getString("case_number"));
                    register.setGender(rs.getString("gender"));
                    register.setBirthDate(rs.getString("birth_date"));
                    register.setAge(rs.getInt("age"));
                    register.setAgeType(rs.getString("age_type"));
                    register.setVisitDate(rs.getString("visit_date"));
                    register.setNoon(rs.getString("noon"));
//                    register.setNoon(rs.getString("noon"));
                    register.setDeptId(rs.getInt("dept_id"));
                    register.setUserId(rs.getInt("user_id"));
                    register.setRegistLeid(rs.getInt("regist_leid"));
                    register.setSettleId(rs.getInt("settle_id"));
                    register.setIsBook(rs.getInt("is_book"));
                    register.setRegistTime(rs.getString("regist_time"));
                    register.setRegisterId(1);
                    register.setVisitState(2);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return register;
            }
        }, caseNumber);
    }

    @Override
    public int remove(String caseNumber) {
        return JdbcUtils.excuteUpdate("delete from `register` where case_number = ?",caseNumber);
//        return 0;
    }
}
