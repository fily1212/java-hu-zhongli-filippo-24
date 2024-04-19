package com.engim.stack.es1;

public class Main {
    public static void main(String[] args) {
        C1 a = new C2();
        a.decrement();
        C2 b = (C2) a;
        b.inverti();
        b.decrement();
        a.decrement();
        //a.inverti();
        a.increment();
        b.inverti();
        //I i = new I();
        a.increment();
        a.increment();
        I i = a;
        while(i.hasNext())
            System.out.println(b.getNum());
        System.out.println("Fine!");
    }
}
