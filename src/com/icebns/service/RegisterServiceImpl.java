package com.icebns.service;

import com.icebns.dao.RegisterDao;
import com.icebns.dao.RegisterDaoImpl;
import com.icebns.pojo.Register;

import java.util.List;

public class RegisterServiceImpl implements IregisterService {
    private RegisterDao dao = new RegisterDaoImpl();

    @Override
    public int add(Register register) {
        return dao.add(register);
    }

    @Override
    public int del(String caseNumber) {
        return dao.remove(caseNumber);
    }

    @Override
    public Register getOne(String caseNumber) {
        return dao.getOne(caseNumber);
    }
}
