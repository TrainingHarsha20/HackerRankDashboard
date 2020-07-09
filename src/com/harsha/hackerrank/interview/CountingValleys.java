package com.harsha.hackerrank.interview;

public class CountingValleys {

    public static void main(String[] args){
        int count = 0, altitude = 0;

        int n = 8;
        String s = "UDDDUDUU";
        for(int i=0; i< n; i++){
            char c = s.charAt(i);
            if(c == 'U') {
                altitude++;
                if(altitude == 0){
                    count++;
                }
            }else {
                altitude--;
            }
        }
        System.out.println(count);

    }
}
