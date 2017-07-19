package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while (true){
            int i = Integer.parseInt(bufferedReader.readLine());
            sum += i;
            count++;
            if (i == -1) {
                System.out.println(++sum / --count);
                return;
            }
        }
    }
}

