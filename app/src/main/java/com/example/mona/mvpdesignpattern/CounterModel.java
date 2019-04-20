package com.example.mona.mvpdesignpattern;

public class CounterModel {
    private int counter;

    public CounterModel(){
        this.counter=0;
    }

    public int getCounter() {
        return counter;
    }

    public int increment(){
        return  counter++;
    }
}
