package org.example;

public class Alien {
    int age;
//    private Laptop lap;
    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }



    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void code(){
        com.compile();
        System.out.println("Let's code");
    }


}
