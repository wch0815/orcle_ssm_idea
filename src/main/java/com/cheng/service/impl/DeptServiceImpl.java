package com.cheng.service.impl;

import com.cheng.dao.IDeptDao;
import com.cheng.pojo.Dept;
import com.cheng.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {

    @Resource
    private IDeptDao deptDao;

    @Override
    public List<Dept> getAllUsers() {
        return deptDao.getAllUsers();
    }

    @Override
    public boolean saveUser(Dept user) {
        return deptDao.saveUser(user) > 0;
    }

    @Override
    public boolean deleteDeptByDEPTNO(int deptno) {
        return deptDao.deleteDeptByDEPTNO(deptno) > 0;
    }
}
