package com.icebns.dao;

import com.icebns.pojo.Pay;

public interface PayDao {
    public int add(Pay pay);
    public int remove(Integer costId);
    public Pay getTwo(String caseNumber);
    public Pay getAll(String caseNumber);
    public int change(Integer costId);
}
