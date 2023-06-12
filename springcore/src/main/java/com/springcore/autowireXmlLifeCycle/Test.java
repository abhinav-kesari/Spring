package com.springcore.autowireXmlLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Autowird - using XML:");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/com/springcore/autowireXmlLifeCycle/autowireconfig.xml");
        Emp e1 = context.getBean("emp1",Emp.class);
        context.registerShutdownHook();
        System.out.println(e1);

    }
}
