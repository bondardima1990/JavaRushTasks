package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = 5;
        int[] numArr = new int[num];

        for (int i = 0; i < numArr.length; i++) {
            int n = Integer.parseInt(reader.readLine());
            numArr[i] = n;
        }

        Arrays.sort(numArr);

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }

    }
}
