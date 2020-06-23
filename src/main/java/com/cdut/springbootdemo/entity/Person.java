package com.cdut.springbootdemo.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;


@Data
public class Person {
    private String username;
    private String password;
    private Integer id;
    private String number;
}
