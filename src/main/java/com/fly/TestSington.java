package com.fly;

import java.util.*;

public class TestSington {
    private TestSington(){

    }
    private static TestSington sington = new TestSington();

    public static TestSington getSington() {
        return sington;
    }

    static ArrayList<String> list = new ArrayList<>();
    public static void add() {
        List<String> list1 = Collections.synchronizedList(list);
        list1.add("111");
        list1.add("222");
        list1.add("333");
        list1.add("111");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("111");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);
//        TreeMap<String,String> map = new TreeMap<String,String>();
//        map.put("111", "111");
//
//        map.put("333", "333");
//        map.put("222", "222");
//        for (Map.Entry kv: map.entrySet()) {
//            System.out.println(kv.getKey() + " : " + kv.getValue());
//        }
//        for (int i = 0; i < 5; i++) {
//            new Thread(()->{
//                add();
//            }).start();
//        }
//        ArrayList<String> list = new ArrayList<>();
//        List<String> synchronizedList = Collections.synchronizedList(list);
////        new Vector();
////        LinkedList<String> list = new LinkedList<>();
//        list.add("111");
//        list.add("222");
//        list.add("333");
//        list.add("111");


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        ListIterator<String> iterator1 = list.listIterator();
//        while (iterator1.hasNext()){
//            String next = iterator1.next();
//            String previous = iterator1.previous();
//            System.out.println(previous);
//        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if(next.equals("222")){
//                //list.remove(next);//ConcurrentModificationException
//                iterator.remove();//OK
//            }
//        }
        //ConcurrentModificationException
//        for (String v : list) {
//            if (v.equals("222")){
//                list.add("555");
//                //list.remove(v);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("222")){
//                list.add("555");
//                //list.remove(list.get(i));
//            }
//        }
//        System.out.println(list.size());
//        LinkedHashMap<String, String> map = new LinkedHashMap<>(16, 0.75f, true);
//        LinkedHashMap<String, String> map = new LinkedHashMap();
//        map.put("a1", "a1");
//        map.put("a2", "a2");
//        map.put("a3", "a3");
//        map.put("a4", "a4");
//        map.put("a2", "a2");
//        map.get("a1");
//
//        for (Map.Entry kv: map.entrySet()) {
//            System.out.println(kv.getKey() + " : " + kv.getValue());
//        }

//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(getSington());
//                }
//            }).start();
//        }
    }
}
