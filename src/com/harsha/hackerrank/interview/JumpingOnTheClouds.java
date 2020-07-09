package com.harsha.hackerrank.interview;

public class JumpingOnTheClouds {
    public static void main(String[] args){
        int jumpCount = 0, j=0;
//        int n = 7;
//        int[] c = {0,0,1,0,0,1,0};
        int[] c = {0,0,0,0,1,0};

        for(int i =1; i < c.length-1; i++){
            if(i+2 == c.length || c[i+2] == 1){
                jumpCount++;
                j++;
            }else {
                j += 2;
                jumpCount++;
            }
        }
        jumpCount--;
        System.out.println( jumpCount);


        int i =0, jump =0;
        while(i < c.length-1){
            if(i+2 == c.length || c[i+2] == 1){
                jump++;
                i++;
            }else {
                i += 2;
                jump++;
            }
        }
        System.out.println( jump);
    }
}
