package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lastName01", "Иван");
        hashMap.put("lastName02", "Петя");
        hashMap.put("lastName03", "Миша");
        hashMap.put("lastName04", "Коля");
        hashMap.put("lastName05", "Петя");
        hashMap.put("lastName06", "Иван");
        hashMap.put("lastName07", "Вова");
        hashMap.put("lastName08", "Миша");
        hashMap.put("lastName09", "Вася");
        hashMap.put("lastName10", "Иван");
        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String value = pair.getValue();
            String key = pair.getKey();
            map.remove(key, value);
            int size = map.size();
            removeItemFromMapByValue(map, value);
            if (map.size() == size) map.put(key, value);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}