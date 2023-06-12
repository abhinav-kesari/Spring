package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
    ApplicationContext context =new ClassPathXmlApplicationContext("src/main/java/com/springcore/spEL/expressionLangConfig.xml");
    Demo d = context.getBean("obj", Demo.class);
        System.out.println(d);

    }
}
