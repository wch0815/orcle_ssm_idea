package com.cheng.dao;

import com.cheng.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IDeptDao {

    @Select("select * from dept")
    List<Dept> getAllUsers();

    @Insert("insert into dept(DEPTNO,DNAME,LOC) values(#{DEPTNO,jdbcType=INTEGER},#{DNAME,jdbcType=VARCHAR},#{LOC,jdbcType=VARCHAR})")
    int saveUser(Dept user);

    @Delete("delete from dept where DEPTNO=#{DEPTNO,jdbcType=INTEGER}")
        int deleteDeptByDEPTNO(int DEPTNO);
}
