package com.springcore.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Emp {
    @Autowired
    @Qualifier("address1")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }


    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    @PostConstruct
    public void hi(){
          System.out.println("Hi!!");

    }
    @PreDestroy
    public void bye(){
        System.out.println("Bye!!");
    }
}
