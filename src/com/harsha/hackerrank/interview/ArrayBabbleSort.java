package com.harsha.hackerrank.interview;

//1 4 10 -3 12  --> 1st pass
//
public class ArrayBabbleSort {
    public static void main(String[] args){
        int[] list = new int[]{4,1,10, -3, 12};
        System.out.println(" Before Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
        System.out.println();
        System.out.println("Before ::" + java.time.LocalTime.now());
        for(int i=0;i<list.length;i++){
            System.out.println("value --> " + i +" :: " + list[i]);
            for(int j=i+1; j<list.length; j++){
                if(list[i]>list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
                System.out.println(list[i] +" :: "+ list[j]);
            }
//            System.out.println();
        }
        System.out.println("After  ::" +java.time.LocalTime.now());
        System.out.println();
        System.out.println("After Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
    }
}
