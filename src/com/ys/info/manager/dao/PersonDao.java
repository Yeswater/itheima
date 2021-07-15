 /*
  * @author yes_water
  * @create 2021/7/14
  */
 package com.ys.info.manager.dao;

 import com.ys.info.manager.domain.Person;

 /**
  * @author yes_water
  * @create 2021/7/14
  */
 public interface PersonDao {
     
     public void delete(String id,Person[] arr) ;
    
     public void update(Person person,Person[] arr) ;
    
     public Person query(String id,Person[] arr);
    
     public boolean isExist(String id,Person[] arr);
     
     public Person[] queryAll(Person[] arr);
 }
