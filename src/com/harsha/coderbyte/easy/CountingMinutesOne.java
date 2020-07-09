package com.harsha.coderbyte.easy;

import java.util.Scanner;

import static java.util.Arrays.stream;

/**
 * Have the function CountingMinutesI(str) take the str parameter being passed which will be two times
 * (each properly formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes
 * between the two times. The time will be in a 12 hour clock format.
 * For example: if str is 9:00am-10:00am then the output should be 60.
 * If str is 1:00pm-11:00am the output should be 1320.
 *
 */

public class CountingMinutesOne {
    final static int MINUTES_IN_HOUR = 60;
    final static int MINUTES_IN_DAY = 24 * 60;


    static  int CountingMinutesI(String str) {
        String[] times = str.split("-");

        int startTime = getMinuteOfDay(times[0]);
        int endTime = getMinuteOfDay(times[1]);

        if (startTime <= endTime) return endTime - startTime;
        return (MINUTES_IN_DAY - startTime) + endTime;
    }

    static int getMinuteOfDay(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        System.out.println( parts[1] +" : : " + parts[1].substring(0, parts[1].length() - 2) );
        int min = Integer.parseInt(parts[1].substring(0, parts[1].length() - 2));
        int minOfDay = time.toLowerCase().contains("pm") ? (hour * MINUTES_IN_HOUR) + min + (MINUTES_IN_DAY / 2) : (hour * MINUTES_IN_HOUR) + min;
        return minOfDay > MINUTES_IN_DAY ? minOfDay - MINUTES_IN_DAY : minOfDay;
    }


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(CountingMinutesI(s.nextLine()));
    }

}
