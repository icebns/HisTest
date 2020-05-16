package com.icebns.dao;

import com.icebns.pojo.Register;

public interface RegisterDao {
    public int add(Register register);
    public Register getOne(String caseNumber);
    public int remove(String caseNumber);
}
