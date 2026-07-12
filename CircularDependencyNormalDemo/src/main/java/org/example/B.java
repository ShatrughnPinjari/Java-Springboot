package org.example;

public class B {
    private A a;
    public B(){
        System.out.println("B Constructor is initialized");
        this.a = new A();
    }
}
