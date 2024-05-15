package com.prachi.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Ravi", 10);
        map.put("Ajay", 20);
        Integer i = map.put("Anil", 30);

        System.out.println(map);
        map.put("Ajay", 10);
        System.out.println(map);


    }
}
