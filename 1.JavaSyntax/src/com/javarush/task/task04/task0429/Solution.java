package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        int countPositive = 0;
        int countNegative = 0;

        if (num1 > 0) countPositive++;
        if (num1 < 0) countNegative++;
        if (num2 > 0) countPositive++;
        if (num2 < 0) countNegative++;
        if (num3 > 0) countPositive++;
        if (num3 < 0) countNegative++;

        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
