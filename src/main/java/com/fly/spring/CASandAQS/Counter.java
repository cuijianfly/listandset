package com.fly.spring.CASandAQS;

import com.fly.A;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    final A a = new A("123");
//    private int count = 100;
    public Counter(){}
    private AtomicInteger count = new AtomicInteger();
    public int getCount(){
        return count.get();
    }
    public void increase(){
        count.getAndIncrement();
    }

//    public int getCount(){
//        return count;
//    }
//    public void increase(){
//        count++;
//    }
//    public void sales(){
//        if(count>0){
//            System.out.println(Thread.currentThread().getName()+"卖出了第"+ count-- +"张票，"+"剩余"+count+"张票");
//        }
//    }
    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.a.getId());
        System.out.println(Thread.currentThread().getId());
//        new Thread(()->{
//            for (int i=0; i<50; i++) {
//                c.sales();
//            }
//        }, "A").start();
//        new Thread(()->{
//            for (int i=0; i<50; i++) {
//                c.sales();
//            }
//        }, "B").start();
//        new Thread(()->{
//            for (int i=0; i<50; i++) {
//                c.sales();
//            }
//        }, "C").start();

    }
}
