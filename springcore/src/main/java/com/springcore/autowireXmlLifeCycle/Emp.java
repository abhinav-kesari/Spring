package com.springcore.autowireXmlLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Emp {
    private  Address  address;

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
