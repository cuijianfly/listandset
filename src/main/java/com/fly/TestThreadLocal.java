package com.fly;

import java.util.Arrays;

public class TestThreadLocal {

    public static final A a1 = new A("123");
    public static final int a = 1;
    int b = 2;

    public static class InnerClass{
        TestThreadLocal local = new TestThreadLocal();
        public static void test(){
            //local.b = 9;
            //TestThreadLocal.a = 100;
            TestThreadLocal local = new TestThreadLocal();
            local.b=111;
            TestThreadLocal.test1();

        }
    }
    public static void test1(){
        //a = 5;
    }
    public void test2(){
        InnerClass innerClass = new InnerClass();
        b = 3;
        //a = 4;
        test1();
    }
    //线程本地存储变量
    private static final ThreadLocal<Integer> THREAD_LOCAL_NUM
            = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[1] = 123;
        objects[2] = "456";
        System.out.println(Arrays.asList(objects));
//        a1.setId("456");
//        //TestThreadLocal.a = 3;
//        for (int i = 0; i <3; i++) {//启动三个线程
//            Thread t = new Thread() {
//                @Override
//                public void run() {
//                    add10ByThreadLocal();
//                }
//            };
//            t.start();
//        }
//    }
//
//    /**
//     * 线程本地存储变量加 5
//     */
//    private static void add10ByThreadLocal() {
//        for (int i = 0; i <5; i++) {
//            Integer n = THREAD_LOCAL_NUM.get();
//            n += 1;
//            THREAD_LOCAL_NUM.set(n);
//            System.out.println(Thread.currentThread().getName() + " : ThreadLocal num=" + n);
//        }
//    }
    }
}
