package com.cdut.springbootdemo.service;


import com.cdut.springbootdemo.dao.PersonDao;
import com.cdut.springbootdemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public Person getById(Integer id){
        return personDao.getById(id);
    }
}
