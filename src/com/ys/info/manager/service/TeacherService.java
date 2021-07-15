package com.ys.info.manager.service;

import com.ys.info.manager.dao.TeacherDao;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class TeacherService extends PersonServiceImpl {
    
    {
        super.dao = new TeacherDao();
    }
    
}
