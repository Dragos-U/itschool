package org.session14collections.onlinepractice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = initializeMap();
        System.out.println(retrieveValue(myMap,"one"));

        updatedMap(myMap,"two", 4);
        System.out.println(retrieveValue(myMap,"two"));

        removeEntry(myMap,"three");
        System.out.println(myMap);

    }

    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one",1);
        myMap.put("two",2);
        myMap.put("three",3);
        return myMap;
    }

    private static Integer retrieveValue(Map<String,Integer> map, String key){
        return map.get(key);
    }

    private static void updatedMap(Map<String, Integer> map, String key, Integer value){
        map.put(key, value);
    }

    private static Map<String, Integer> removeEntry(Map<String, Integer> map, String key){
        map.remove(key);
        return map;
    }
}
