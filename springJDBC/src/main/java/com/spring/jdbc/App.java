package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImple;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Spring JDBC started...");
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcconfig.class);

      //  ApplicationContext context = new ClassPathXmlApplicationContext("jdbcconfig.xml");
        StudentDao stud = context.getBean("studentDao", StudentDaoImple.class);

        //insert
        /*String query = "insert into student() values(?,?,?)";

        //fire query
        int result = jdbc1.update(query,4,"Vishal4","Alld4  ");*/
//        insert
        Student student = new Student(27,"Abhinav Kesari23","Noida23");
//        update
        Student ustudent = new Student(4,"Abhinav Kesari44555","Noida44555");

         int result = stud.insert(student);
         int uresult = stud.update(ustudent);
         int dresult = stud.delete(237);
         Student sresult = stud.select(238);


        System.out.println("Data inserted... "+result);
        System.out.println("Data updated... "+uresult);
        System.out.println("Data deleted... "+dresult);
        System.out.println("Student data = "+sresult);

        List<Student> sALL = stud.selectAll();
        for (Student s:sALL
             ) {
            System.out.println(s);
        }
    }
}
