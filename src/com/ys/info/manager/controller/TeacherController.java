package com.ys.info.manager.controller;

import com.ys.info.manager.domain.Person;
import com.ys.info.manager.service.TeacherService;


/**
 * @author yes_water
 * @create 2021/7/10
 */
public class TeacherController extends PersonControllerImpl {
    
    public void menu(Person[] arr) {
        super.service = new TeacherService();
        super.sys_name = "老师";
        super.id_name = "工号";
        super.identity_name = "老师";
        super.menu(arr);
    }
    
    //增加学生
    public void add() {
        super.add();
    }
    
    //删除学生
    public void delete() {
        super.delete();
    }
    
    //更改学生
    public void update() {
        super.update();
    }
    
    //查询学生
    public void query() {
        super.query();
    }
    
}
