package com.cheng.controller;

import com.cheng.pojo.Dept;
import com.cheng.service.IDeptService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    @Resource
    private IDeptService deptService;

    @GetMapping("/Depts")
    public List<Dept> getAllUsers(){
        return deptService.getAllUsers();
    }

    @PostMapping("/Dept")
    public boolean saveDept(Dept dept){

        System.out.println(dept);
        boolean b = deptService.saveUser(dept);
        return b;
    }

    @DeleteMapping("/Dept/{DEPTNO}")
    public ResponseEntity<Void> deleteDeptByDEPTNO(@PathVariable int DEPTNO){
        System.out.println(DEPTNO);
        boolean b = deptService.deleteDeptByDEPTNO(DEPTNO);
        System.out.println(b);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
