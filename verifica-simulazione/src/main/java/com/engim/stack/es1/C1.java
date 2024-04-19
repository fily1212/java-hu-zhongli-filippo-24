package com.engim.stack.es1;

public class C1 implements I{
    private int i = 0;
    public void increment(){
        i++;
        System.out.println(i);
    }

    public void decrement(){
        i--;
        System.out.println(i);
    }
    @Override
    public boolean hasNext() {
        return i != 0;
    }

    @Override
    public int getNum() {
        if(i > 0)
            return --i;
        else if(i < 0)
            return ++i;
        else return 0;
    }
}
