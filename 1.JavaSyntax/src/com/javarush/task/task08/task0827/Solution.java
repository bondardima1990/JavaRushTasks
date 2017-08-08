package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date inputDate = new Date(date);
        Date yearStartTime = new Date();

        yearStartTime.setYear(inputDate.getYear());
        yearStartTime.setMonth(0);
        yearStartTime.setDate(1);

        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        int dateCount = (int) ((inputDate.getTime() - yearStartTime.getTime())/(24 * 60 * 60 * 1000));
        if (dateCount % 2 == 0)
            return false;
        else return true;
    }
}