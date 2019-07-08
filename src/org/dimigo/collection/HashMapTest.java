package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //Map(key, value로 구성)
        Map<String, Integer> map = new HashMap<>();

        map.put("kor", 100);
        map.put("mat", 100);
        map.put("eng", 100);

        printMap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");
        printMap(map);

        map.clear();
        System.out.println( "==" );
        printMap(map);

        //HashMap (key : Stirng, value : List<String>)
        Map<String, List<String>> map2 = new HashMap<>();

        //ArrayList (Map<Stirng, String>
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map3 = new HashMap<>();
        map3.put("key1", "value1");
        list.add(map3);
    }

    private static void printMap(Map<String, Integer> map) {
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();
    }
}