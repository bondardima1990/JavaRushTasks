package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        if (num % 2 == 0) {
            if (num >= 1 & num <= 9) System.out.println("четное однозначное число");
            else if (num >= 10 & num <= 99) System.out.println("четное двузначное число");
            else if (num >= 100 & num <=999) System.out.println("четное трехзначное число");
        }
        else {
            if (num >= 1 & num <= 9) System.out.println("нечетное однозначное число");
            else if (num >= 10 & num <= 99) System.out.println("нечетное двузначное число");
            else if (num >= 100 & num <=999) System.out.println("нечетное трехзначное число");
        }
    }
}
