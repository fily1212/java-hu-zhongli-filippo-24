package com.engim.stack.es1;

public class C2 extends C1{
    private boolean contrario = false;

    @Override
    public void decrement() {
        if(contrario)
            super.increment();
        else
            super.decrement();
    }

    @Override
    public void increment() {
        if(!contrario) super.increment();
        else super.decrement();
    }

    public void inverti(){
        contrario = !contrario;
    }

}
