package com.example.mona.mvpdesignpattern;

public class Presenter {

    CounterModel counterModel;
    Counter counter;
    private int count;

    public Presenter(Counter counter) {
        this.counter = counter;
        this.counterModel = new CounterModel();
        count=0;
    }
    public void increment(){
        counterModel.increment();
        counter.incrementCounter(counterModel.getCounter());
    }
}
