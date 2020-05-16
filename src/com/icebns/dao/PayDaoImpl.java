package com.icebns.dao;

import com.icebns.pojo.Pay;
import com.icebns.utils.JdbcUtils;
import com.icebns.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PayDaoImpl implements PayDao{
    @Override
    public int add(Pay pay) {
        return JdbcUtils.excuteUpdate("INSERT INTO `cost`(`case_number`, `real_name`, `cost_name`," +
                        " `cost_pay`, `cost_number`, `cost_time`, `cost_state`) VALUES ( ?,?,?,?,?,?,?);",pay.getCaseNumber(),
                pay.getRealName(),pay.getCostName(),pay.getCostPay(),pay.getCostNumber(),pay.getCostTime(),pay.getCostState());
    }

    @Override
    public int remove(Integer costId) {
        return JdbcUtils.excuteUpdate("delete from `cost` where cost_id = ?",costId);
    }

    @Override
    public Pay getTwo(String caseNumber) {
        return JdbcUtils.queryOne("select * from `cost` where case_number = ?", new RowMap<Pay>() {
            @Override
            public Pay rowMapping(ResultSet rs) {
                Pay pay = new Pay();
                try {
                    pay.setCostId(rs.getInt("cost_id"));
                    pay.setCaseNumber(rs.getString("case_number"));
                    pay.setRealName(rs.getString("real_name"));
                    pay.setCostName(rs.getString("cost_name"));
                    pay.setCostPay(rs.getInt("cost_pay"));
                    pay.setCostNumber(rs.getInt("cost_number"));
                    pay.setCostTime(rs.getString("cost_time"));
                    pay.setCostState(rs.getString("cost_state"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return pay;
            }
        }, caseNumber);
    }

    @Override
    public Pay getAll(String caseNumber) {
        return null;
    }

    @Override
    public int change(Integer costId) {
        return JdbcUtils.excuteUpdate("UPDATE `cost` SET `cost_state` = '已收费' WHERE `cost_id` = ?;",costId);
    }


}
