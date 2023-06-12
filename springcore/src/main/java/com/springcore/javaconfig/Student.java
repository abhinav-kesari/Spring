package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Student {
    @Value("23")
    private int id;

    @Autowired
    private Samosa sm;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Samosa getSm() {
        return sm;
    }

    public void setSm(Samosa sm) {
        this.sm = sm;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sm=" + sm.sm() +
                '}';
    }

    public Student() {
    }

    public Student(int id, Samosa sm) {
        this.id = id;
        this.sm = sm;
    }
}
