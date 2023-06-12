package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student(1,"Abhinav Kesari","Prayagraj");
        int ires = studentDao.insert(student);
        System.out.println("Data inserted =` "+ ires);


    }
}