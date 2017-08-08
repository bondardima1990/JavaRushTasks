package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add(i);
        }
        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
       Iterator<Integer> iterator = set.iterator();
       while (iterator.hasNext()){
           Integer number = iterator.next();
           if (number > 10)
               iterator.remove();
       }
       return set;
    }

    public static void main(String[] args) {
    }
}
