package com.cheng.service;

import com.cheng.pojo.Dept;

import java.util.List;

public interface IDeptService {

    List<Dept> getAllUsers();

    boolean saveUser(Dept user);

    boolean deleteDeptByDEPTNO(int deptno);
}
