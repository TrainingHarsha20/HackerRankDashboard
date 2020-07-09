package com.harsha.hackerrank.interview.arrays;

import java.io.IOException;

public class MidValueOfArray {
    public static void main(String[] args) throws IOException {
    int[] even = {0,2,3,4,5,6,7,8};
    int[] odd = {1,2,3,4,5,6,7};

    int eLen = even.length;
    int oLen = odd.length;

      int eMid =  even[0] + even[eLen-1]/2;
      int oMid =  odd[0] + odd[oLen-1]/2;

      System.out.println(" even.length : " + eLen);
      System.out.println(" even array mid value : " + eMid);

      System.out.println(" odd.length : " + oLen);
      System.out.println(" odd array mid value : " + oMid);

        int mid1 = (0 + (eLen-1)) >>> 1;
        int mid2 = (0 + (oLen-1)) >>> 1;
        System.out.println("Mid Value OF Array Is "+ mid1 + " actualy length :" + (eLen-1));
        System.out.println("Mid Value OF Array Is "+ mid2 + " actualy length :" + (oLen-1));
      System.out.println();
    }

    static int getLow(int[] input){
        return input[0];
    }
}
