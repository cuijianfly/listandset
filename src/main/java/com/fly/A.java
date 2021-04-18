package com.fly;

import java.lang.reflect.Constructor;
import java.util.Objects;

public class A {

    public A(){}
    public A(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void test(){
        System.out.println("hello");
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;


//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof A){
//            A a = (A) obj;
//            if(id.equals(a.getId())){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return this.id.hashCode();
//    }

    public static void main(String[] args) throws Exception {
        A a = new A("aaa");
        A a2 = new A("aaa");


        System.out.println(a.equals(a2));
        System.out.println(a.hashCode()==a2.hashCode());
        A a4 = (A) Class.forName("com.fly.A").newInstance();
        a4.test();

        System.out.println("=============");

    }
}
