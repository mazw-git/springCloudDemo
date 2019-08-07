package com.bbg.pojo;

import com.baomidou.mybatisplus.annotations.TableField;

public class SpacemanReclass {
    private Integer dept;
    private String deptName;
    @TableField("class")
    private Integer classFoo;
    private String className;
    private Integer subclass;
    private String subName;
    private Integer ssubclass;
    private String ssubName;
    private String spaceclassNew;
    private String spacenameNew;
    private Integer spaceSku;
    public Integer getDept() {
        return dept;
    }
    public void setDept(Integer dept) {
        this.dept = dept;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    
    public Integer getClassFoo() {
        return classFoo;
    }
    public void setClassFoo(Integer classFoo) {
        this.classFoo = classFoo;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public Integer getSubclass() {
        return subclass;
    }
    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }
    public String getSubName() {
        return subName;
    }
    public void setSubName(String subName) {
        this.subName = subName;
    }
    public Integer getSsubclass() {
        return ssubclass;
    }
    public void setSsubclass(Integer ssubclass) {
        this.ssubclass = ssubclass;
    }
    public String getSsubName() {
        return ssubName;
    }
    public void setSsubName(String ssubName) {
        this.ssubName = ssubName;
    }
    public String getSpaceclassNew() {
        return spaceclassNew;
    }
    public void setSpaceclassNew(String spaceclassNew) {
        this.spaceclassNew = spaceclassNew;
    }
    public String getSpacenameNew() {
        return spacenameNew;
    }
    public void setSpacenameNew(String spacenameNew) {
        this.spacenameNew = spacenameNew;
    }
    public Integer getSpaceSku() {
        return spaceSku;
    }
    public void setSpaceSku(Integer spaceSku) {
        this.spaceSku = spaceSku;
    }
    @Override
    public String toString() {
        return "SpacemanReclass [dept=" + dept + ", deptName=" + deptName + ", classFoo=" + classFoo
                + ", className=" + className + ", subclass=" + subclass + ", subName=" + subName
                + ", ssubclass=" + ssubclass + ", ssubName=" + ssubName + ", spaceclassNew=" + spaceclassNew
                + ", spacenameNew=" + spacenameNew + ", spaceSku=" + spaceSku + "]";
    }
    
}
