package com.mazw.pojo;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-01
 */
public class Test01 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Double id;
    private String name;
    private String gender;
    private Double age;
    private String address;
    private Date regdata;


    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegdata() {
        return regdata;
    }

    public void setRegdata(Date regdata) {
        this.regdata = regdata;
    }

    @Override
    public String toString() {
        return "Test01{" +
        ", id=" + id +
        ", name=" + name +
        ", gender=" + gender +
        ", age=" + age +
        ", address=" + address +
        ", regdata=" + regdata +
        "}";
    }
}
