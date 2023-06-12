package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Collection Injection =List,Set,Map,Properties");
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/com/springcore/collections/collectionconfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1);
    }
}
