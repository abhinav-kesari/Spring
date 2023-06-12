package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Demo {
    @Value("#{ 3+4 }")
    private int id;
    @Value("Expression Lang")
    private String name;
    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private double sqrt;
    @Value("#{ T(java.lang.Math).PI }")
    private double pi;
    @Value("#{ new String('Abhinav') }")
    private String object;
    @Value("#{ 7>2 }")
    private boolean isActive;

    @Override
    public String toString() {
        return "demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sqrt=" + sqrt +
                ", pi=" + pi +
                ", object='" + object + '\'' +", isActive='" + isActive + '\'' +
                '}';
    }

    public Demo() {
    }

    public Demo(int id, String name, int sqrt, double pi, String object) {
        this.id = id;
        this.name = name;
        this.sqrt = sqrt;
        this.pi = pi;
        this.object = object;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSqrt() {
        return sqrt;
    }

    public void setSqrt(int sqrt) {
        this.sqrt = sqrt;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
