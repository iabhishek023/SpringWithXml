package org.example;

public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("The laptop will compile");
    }
}
