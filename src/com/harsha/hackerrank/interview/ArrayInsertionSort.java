package com.harsha.hackerrank.interview;

public class ArrayInsertionSort {
    public static void main(String[] args){
        int[] list = new int[]{4,1,10, -3, 12};
        System.out.println(" Before Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
        System.out.println();
        System.out.println("Before ::" + java.time.LocalTime.now());


        for(int i=0;i<list.length;i++){
         int key = list[i];
         int j = i-1;

         while(j>=0 && list[j] > key ){
             list[j+1] = list[j];
             j = j-1;
         }
         list[j+1] = key;
        }

        System.out.println("After  ::" +java.time.LocalTime.now());
        System.out.println();
        System.out.println("After Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
    }
}
