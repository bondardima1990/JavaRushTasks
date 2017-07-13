package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfDay = Integer.parseInt(bufferedReader.readLine());
        if (numOfDay < 1 || numOfDay > 7) System.out.println("такого дня недели не существует");
        if (numOfDay == 1) System.out.println("понедельник");
        if (numOfDay == 2) System.out.println("вторник");
        if (numOfDay == 3) System.out.println("среда");
        if (numOfDay == 4) System.out.println("четверг");
        if (numOfDay == 5) System.out.println("пятница");
        if (numOfDay == 6) System.out.println("суббота");
        if (numOfDay == 7) System.out.println("воскресенье");
    }
}