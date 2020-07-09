package com.harsha.hackerrank.interview;

public class ArraySelectionSort {
    public static void main(String[] args){
        int[] list = new int[]{4,1,10, -3, 12};
        System.out.println(" Before Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
        System.out.println();
        System.out.println("Before ::" + java.time.LocalTime.now());

        //move one by one boundry of un sort array
        for(int i=0;i<list.length-1;i++){
            //find the minimum element in unsorted array
            int idx = i;
            for(int j=i+1; j<list.length; j++){
                if(list[j] < list[idx]) {
                    idx = j;
                }
            }
            //swap with minimum element
            int temp = list[idx];
            list[idx] = list[i];
            list[i] = temp;
        }
        System.out.println("After  ::" +java.time.LocalTime.now());
        System.out.println();
        System.out.println("After Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
    }
}
