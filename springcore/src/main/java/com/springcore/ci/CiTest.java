package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {
    public static void main(String[] args) {
        System.out.println("Contructor Injection - ");
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/com/springcore/ci/ciconfig.xml");
        Person p =(Person) context.getBean("ciperson");
        System.out.println(p);
    }
}
