package com.icebns.service;

import com.icebns.pojo.Register;

import java.util.List;

public interface IregisterService {
    public int add(Register register);
    public int del(String caseNumber);
    public Register getOne(String caseNumber);
}
