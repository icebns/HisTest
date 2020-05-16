package com.icebns.service;

import com.icebns.dao.PayDao;
import com.icebns.dao.PayDaoImpl;
import com.icebns.pojo.Pay;
import com.icebns.pojo.Register;

public class PayServiceImpl implements PayService{
    private PayDao dao = new PayDaoImpl();
    @Override
    public int add(Pay pay) {
        return dao.add(pay);
    }

    @Override
    public int del(Integer costId) {
        return dao.remove(costId);
    }

    @Override
    public Pay getTwo(String caseNumber) {
        return dao.getTwo(caseNumber);
    }

    @Override
    public Pay getAll(String caseNumber) {
        return dao.getAll(caseNumber);
    }

    @Override
    public int change(Integer costId) {
        return dao.change(costId);
    }
}
