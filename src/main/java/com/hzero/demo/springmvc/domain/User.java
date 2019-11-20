package com.hzero.demo.springmvc.domain;

import java.io.Serializable;

/**
 * pojo:user
 *
 * 对应MySQL建表语句
 * CREATE TABLE `user` (
 * `id`  int(11) NOT NULL AUTO_INCREMENT ,
 * `name`  varchar(10) NOT NULL ,
 * `password`  varchar(16) NOT NULL ,
 * `address`  varchar(200) NULL ,
 * `phone`  varchar(20) NULL ,
 * PRIMARY KEY (`id`)
 * )
 * ;
 *
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
