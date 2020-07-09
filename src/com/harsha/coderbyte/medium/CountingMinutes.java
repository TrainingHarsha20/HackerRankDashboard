package com.harsha.coderbyte.medium;

import java.util.Scanner;

/**
 * Have the function CountingMinutes(str) take the str parameter being passed
 * which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen and
 * return the total number of minutes between the two times.
 *
 * The time will be in a 12 hour clock format.
 *
 * For example: if str is 9:00am-10:00am then the output should be 60.
 * If str is 1:00pm-11:00am the output should be 1320.
 *
 */
public class CountingMinutes {

    final static int MINUTES_IN_DAY = 24*60;
    final static int MINUTES_IN_HOUR = 60;

    static int coutingTime(String str){
        String[] breakString = str.split("-");
        int startTime = convertToMins(getSubStr(breakString[0], getLen(breakString[0])-2, getLen(breakString[0]))
                , Integer.parseInt(getSubStr(breakString[0], 0, getHourIdx(breakString[0])))
                , Integer.parseInt(getSubStr(breakString[0], getHourIdx(breakString[0])+1, getLen(breakString[0])-2)));

        int endTime = convertToMins(getSubStr(breakString[1], 0, getHourIdx(breakString[1]))
                , Integer.parseInt(getSubStr(breakString[1], 0, getHourIdx(breakString[1])))
                , Integer.parseInt(getSubStr(breakString[1], getHourIdx(breakString[1])+1, getLen(breakString[0])-2)));

        if (startTime <= endTime) return endTime - startTime;
        return (MINUTES_IN_DAY - startTime) + endTime;

    }
    static int getLen(String s){
        return s.length();
    }

    static int convertToMins(String type, int hour, int min){
        return type.toLowerCase().contains("pm") ? (hour * MINUTES_IN_HOUR) + min + (MINUTES_IN_DAY / 2) : (hour * MINUTES_IN_HOUR) + min;
    }

    static int getHourIdx(String input){
        return input.indexOf(":");
    }

    static String getSubStr(String input, int startIdx, int endIdx){
        return input.substring(startIdx, endIdx);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(coutingTime(s.nextLine()));
    }

}
