package com.ys.info.manager.dao;

import com.ys.info.manager.domain.Person;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class PersonDaoImpl implements PersonDao {
    
    public Person[] arr = new Person[5];
    
    public boolean add(Person person, Person[] arr) {
        int index = -1;     //第一个空元素的索引
        for (int i = 0; i < arr.length; i++) {  //判断是否有空位置
            if (arr[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {  //没空位置 返回false
            return false;
        } else {    //有空位置 添加学生 返回 true
            arr[index] = person;
            return true;
        }
    }
    
    public void delete(String id, Person[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(id)) {
                arr[i] = null;// 将学生置为空
                break;
            }
        }
        
    }
    
    public void update(Person person, Person[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(person.getId())) {
                arr[i] = person;
                break;
            }
        }
        
    }
    
    public Person query(String id, Person[] arr) {
        Person person = new Person();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(id)) {
                person = arr[i];
                break;
            }
        }
        return person;
        
    }
    
    public boolean isExist(String id, Person[] arr) {
        boolean flag = false;
        if (arr.length == 0) {
            return false;
        } else {
            for (Person person : arr) {
                if (person != null && person.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            return flag;
        }
    }
    
    public Person[] queryAll(Person[] arr) {
        return arr;
    }
    
    
}
