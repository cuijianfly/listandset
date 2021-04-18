package com.fly;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeSet {


    public static void main(String[] args) {

        long p = ChronoUnit.DAYS.between(LocalDate.of(2019, 11, 14), LocalDate.of(2021, 4, 9));
        System.out.println("两天之间的差在天数   : " + p);
        Map<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
//        Map<String, String> map = new TreeMap<>();
//        Map<String, String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("a", "111");
        map.put("b", "222");
        map.put("c", "333");
        map.put("T", "444");
        for (Map.Entry<String, String> kv: map.entrySet()) {
            System.out.println(kv.getKey() + " : " + kv.getValue());
        }
    }
}
