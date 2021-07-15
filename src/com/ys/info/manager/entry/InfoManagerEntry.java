package com.ys.info.manager.entry;

import com.ys.info.manager.controller.StudentController;
import com.ys.info.manager.controller.TeacherController;
import com.ys.info.manager.domain.Person;
import com.ys.info.manager.domain.Student;
import com.ys.info.manager.domain.Teacher;

import java.util.Scanner;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class InfoManagerEntry {
    
    static Person[] ss = new Person[10]; //存储学生
    static Person[] ts = new Person[10]; //存储老师
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; true; i++) {
            if (i == 1) {
                System.out.println("----------------管理系统----------------");
                System.out.println("- 1 -> 学生管理 2 -> 老师管理 3 -> 退出 -");
            }
            System.out.print("黑马管理系统: ");
            String opt = sc.nextLine();
            switch (opt) {
                case "1":
                    StudentController controller = new StudentController();
                    controller.menu(ss);
                    break;
                case "2":
                    TeacherController controller1 = new TeacherController();
                    controller1.menu(ts);
                    break;
                case "3":
                    System.out.println("-> 再见");
                    exit();
                
            }
        }
    }
    
    private static void exit() {
        System.exit(0);
    }
}
