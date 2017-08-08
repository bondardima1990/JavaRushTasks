package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add("Л" + i);
        }
        return (HashSet<String>) hashSet;
    }

    public static void main(String[] args) {

    }
}
