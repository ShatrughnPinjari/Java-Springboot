package org.example;

public class A {
    private B b;
    public A (){
        System.out.println("A constructor is initialized");
        this.b = new B();
    }
}
