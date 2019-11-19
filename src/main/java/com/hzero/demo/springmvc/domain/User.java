package com.hzero.demo.springmvc.domain;

import java.io.Serializable;

/**
 * pojo:user
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    private String password;

    private String address;

    private Integer phone;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPhone() {
        return phone;
    }


}
