package com.cdut.springbootdemo.entity;

import lombok.Data;

@Data
public class User {
    String account;
    String act_pwd;
    String phone;

    public String getAccount() {
        return account;
    }

    public String getAct_pwd() {
        return act_pwd;
    }

    public String getPhone() {
        return phone;
    }
}
