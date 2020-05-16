package com.icebns.service;

import com.icebns.dao.MediDao;
import com.icebns.dao.MediDaoImpl;
import entity.Medicine;

public class MediServiceImpl implements MediService {
    private MediDao dao = new MediDaoImpl();
    @Override
    public int add(Medicine medi) {
        return dao.add(medi);
    }
}
