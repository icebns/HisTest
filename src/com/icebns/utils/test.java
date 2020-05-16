package com.icebns.utils;

import com.icebns.pojo.Register;
import com.icebns.utils.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static com.icebns.utils.JdbcUtils.excuteUpdate;

public class test {
    public static void main(String[] args) {
//        System.out.println(excuteUpdate("select * from `names` where age = ?",2));
//        //增加
//        new JdbcUtils().excuteUpdate("insert into `test`.`register`(`case_number`, `real_name`, `gender`, `id_number`, `birth_date`, `age`," +
//                " `age_type`, `home_address`, `visit_date`, `noon`, `dept_id`, `user_id`, `regist_leid`, `settle_id`, `is_book`, `regist_time`," +
//                " `register_id`, `visit_state`) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)","019", "武二宁",1, "130104199809242430",
//                "1998-09-06", 21, "岁", "张家口", "2020-05-11", "上午", 2, 1, 1, 2, "否", "2020-05-13 18:01:22", 1, 2);
//        //删除
//        new JdbcUtils().add("delete from `test`.`names` where id = ?",25);
//        //更新
//        new JdbcUtils().add("UPDATE `test`.`register` SET `case_number` = ?, `real_name` = ?, `gender` = ?, `id_number` = ?, `birth_date` " +
//                "= ?, `age` = ?, `age_type` = ?, `home_address` = ?, `visit_date` = ?, `noon` = ?, `dept_id` = ?, `user_id` = ?, `regist_leid` " +
//                "= ?, `settle_id` = ?, `is_book` = ?, `regist_time` = ?, `register_id` = ?, `visit_state` = ? WHERE `id` = ?;","099",
//                "武二宁",1, "130104199809242430", "1998-09-06", 21, "岁", "张家口", "2020-05-11", "上午", 2, 1, 1, 2, "否", "2020-05-13 18:01:22",
//                1, 2,21);
//        //查找
//        JdbcUtils ju = new JdbcUtils();
//        List<Register> registers = ju.select("select * from `test`.`register`",new RowMap<Register>() {
//            @Override
//            public Register rowMapping(ResultSet rs) {
//                Register register = new Register();
//                try {
//                    int id = rs.getInt("id");
//                    String caseNumber = rs.getString("case_number");
//                    String realName = rs.getString("real_name");
//                    int gender = rs.getInt("gender");
//                    String idNumber = rs.getString("id_number");
//                    String birthDate = rs.getString("birth_date");
//                    int age = rs.getInt("age");
//                    String ageType = rs.getString("age_type");
//                    String homeAddress = rs.getString("home_address");
//                    String visitDate = rs.getString("visit_date");
//                    String noon = rs.getString("noon");
//                    int deptId = rs.getInt("dept_id");
//                    int userId = rs.getInt("user_id");
//                    int registLeid = rs.getInt("regist_leid");
//                    int settleId = rs.getInt("settle_id");
//                    String isBook = rs.getString("is_book");
//                    String registTime = rs.getString("regist_time");
//                    int registerId = rs.getInt("register_id");
//                    int visitState = rs.getInt("visit_state");
//                    register.setId(id);
//                    register.setCaseNumber(caseNumber);
//                    register.setRealName(realName);
//                    register.setGender(gender);
//                    register.setIdNumber(idNumber);
//                    register.setBirthDate(birthDate);
//                    register.setAge(age);
//                    register.setAgeType(ageType);
//                    register.setHomeAddress(homeAddress);
//                    register.setVisitDate(visitDate);
//                    register.setNoon(noon);
//                    register.setDeptId(deptId);
//                    register.setUserId(userId);
//                    register.setRegistLeid(registLeid);
//                    register.setSettleId(settleId);
//                    register.setIsBook(isBook);
//                    register.setRegistTime(registTime);
//                    register.setRegisterId(registerId);
//                    register.setVisitState(visitState);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                return register;
//            }
//        },null);
//        for (Register register:registers){
//            System.out.println(register.toString());
//        }


//        a();
    }
//    public static void a(int... a){
//
//        for(int i=0;i<a.length;i++){
//            System.out.println("[" + a[i] + "]");
//        }
//
//        new JdbcUtils().select("select * from `test`.`names` where id = ?",RowMap<Cat>,null);
//        JdbcUtils ju = new JdbcUtils();
//        List<Cat> cats = ju.select("select * from `test`.`register`",new RowMap<Cat>() {
//            @Override
//            public Cat rowMapping(ResultSet rs) {
//                Cat cat = new Cat();
//                try {
//                    int id = rs.getInt("id");
//                    String name = rs.getString("name");
//                    int age = rs.getInt("age");
//                    cat.setId(id);
//                    cat.setName(name);
//                    cat.setAge(age);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                return cat;
//            }
//        },null);
//        for (Cat cat:cats){
//            System.out.println(cat);
//        }
//    }
}