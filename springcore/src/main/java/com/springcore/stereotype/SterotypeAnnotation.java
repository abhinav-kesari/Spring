package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SterotypeAnnotation  {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/com/springcore/stereotype/sterotypeAnnotationConfig.xml");
        Student stud = context.getBean("stud1",Student.class);
        Student stud2 = context.getBean("stud1",Student.class);
        Student stud3 = context.getBean("stud1",Student.class);
        System.out.println(stud);
        System.out.println(stud.getAddress().getClass().getName());
        System.out.println(stud.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud3.hashCode());

    }
}
