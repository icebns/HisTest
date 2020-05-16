package com.icebns.service;

import com.icebns.pojo.Pay;

public interface PayService {
    public int add(Pay pay);
    public int del(Integer costId);
    public Pay getTwo(String caseNumber);
    public Pay getAll(String caseNumber);
    public int change(Integer costId);
}
