package com.ys.info.manager.service;

import com.ys.info.manager.dao.PersonDaoImpl;
import com.ys.info.manager.domain.Person;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class PersonServiceImpl implements PersonService {
    
    PersonDaoImpl dao = new PersonDaoImpl() ;
    
    public boolean add(Person person ,Person[] arr) {
        return dao.add(person, arr);
    }
    
    public void delete(String id,Person[] arr) {
        dao.delete(id,arr);
    }
    
    public void update(Person person,Person[] arr) {
        dao.update(person,arr);
    }
    
    public Person query(String id,Person[] arr) {
        return dao.query(id, arr);
    }
    
    public boolean isExist(String id,Person[] arr) {
        return dao.isExist(id, arr);
    }
    
    public Person[] queryAll(Person[] arr) {
        return arr;
    }
    
}
