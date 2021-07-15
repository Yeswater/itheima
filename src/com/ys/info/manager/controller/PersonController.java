 /*
  * @author yes_water
  * @create 2021/7/14
  */
 package com.ys.info.manager.controller;

 import com.ys.info.manager.domain.Person;

 /**
  * @author yes_water
  * @create 2021/7/14
  */
 public interface PersonController {
     public void menu(Person[] arr);
    
     //增加学生/老师
     public void add();
    
     //删除学生/老师
     public void delete();
    
     //更改学生/老师
     public void update();
    
     //查询学生/老师
     public void query();
 }
