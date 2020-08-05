package com.cheng.pojo;


public class Dept {
    private int DEPTNO;
    private String DNAME;
    private String LOC;

    @Override
    public String toString() {
        return "Dept{" +
                "DEPTNO=" + DEPTNO +
                ", DNAME='" + DNAME + '\'' +
                ", LOC='" + LOC + '\'' +
                '}';
    }

    public int getDeptno() {
        return DEPTNO;
    }

    public void setDeptno(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public String getDname() {
        return DNAME;
    }

    public void setDname(String DNAME) {
        this.DNAME = DNAME;
    }

    public String getLoc() {
        return LOC;
    }

    public void setLoc(String LOC) {
        this.LOC = LOC;
    }
}
