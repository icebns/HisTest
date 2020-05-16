package com.icebns.dao;

import com.icebns.utils.JdbcUtils;
import entity.Medicine;

public class MediDaoImpl implements MediDao{
    @Override
    public int add(Medicine medi) {
        return  JdbcUtils.excuteUpdate("INSERT INTO `hospital`.`medicine`(`mname`, `msort`, `mshop`, `mcount`, " +
                        "`mprice`, `mdesc`, `mphoto`) VALUES (?,?,?,?,?,?,?);",medi.getMname(),medi.getMsort(),medi.getMshop(),
                medi.getMcount(),medi.getMprice(),medi.getMdesc(),medi.getMphoto());
    }
}
