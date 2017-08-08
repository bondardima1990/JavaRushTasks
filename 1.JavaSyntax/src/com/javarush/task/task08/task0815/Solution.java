package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lastName1", "Иван");
        hashMap.put("lastName2", "Петя");
        hashMap.put("lastName3", "Миша");
        hashMap.put("lastName4", "Коля");
        hashMap.put("lastName5", "Петя");
        hashMap.put("lastName6", "Иван");
        hashMap.put("lastName7", "Вова");
        hashMap.put("lastName8", "Миша");
        hashMap.put("lastName9", "Вася");
        hashMap.put("lastName10", "Иван");
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name))
                count++;
        }
        System.out.println(count);
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return 1;
    }

    public static void main(String[] args) {
    }
}