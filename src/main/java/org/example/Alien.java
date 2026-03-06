package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    int age;
    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }

//    private Laptop lap;
//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public void code(){
        com.compile();
        System.out.println("Let's code");
    }


}
