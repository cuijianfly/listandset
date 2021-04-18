package com.fly;

public class SingletonInner {

    private SingletonInner(){}

    private static class innerClass {
       static SingletonInner singleton = new SingletonInner();
    }

    public static SingletonInner getInstance(){

        return innerClass.singleton;
    }
}
