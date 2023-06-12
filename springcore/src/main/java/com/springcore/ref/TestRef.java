package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
    public static void main(String[] args) {
        System.out.println("Ref injection B in A class -");
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/com/springcore/ref/refconfig.xml");
        A a =(A)context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getObj().getY());
        System.out.println(a);
    }
}
