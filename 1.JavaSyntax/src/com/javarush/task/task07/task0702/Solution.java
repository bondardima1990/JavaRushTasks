package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            strings[i] = bufferedReader.readLine();
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[9 - i]);
        }
    }
}