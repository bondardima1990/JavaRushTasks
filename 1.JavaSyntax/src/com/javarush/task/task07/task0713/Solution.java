package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));

            if (list.get(i) % 3 == 0 & list.get(i) % 2 == 0){
                list3.add(list.get(i));
                list2.add(list.get(i));
            }
            else if (list.get(i) % 3 == 0)
                list3.add(list.get(i));
            else if (list.get(i) % 2 == 0)
                list2.add(list.get(i));
            else listOther.add(list.get(i));
        }

        printList(list3);
        printList(list2);
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
