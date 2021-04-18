package com.fly;

public class SingleTonLazy {
        private SingleTonLazy(){}

        private volatile static SingleTonLazy singleton = null;

        public static SingleTonLazy getInstance(){
            if(singleton == null){
                synchronized (SingleTonLazy.class){
                    if(singleton == null){
                        singleton = new SingleTonLazy();
                    }
                }
            }
            return singleton;
        }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(getInstance());
                }
            }).start();
        }
    }
}
