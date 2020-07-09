package com.harsha.hackerrank.interview;

public class ArrayQuickSort {

    public static int partition(int[] arr, int low, int high) {
        //As pivot as last index
        int pivot =  arr[high];

        //index of smaller element
        int i = low-1;
        for(int j=low; j<high;j++){
            //if current element is smaller than cor equals to current element
            //swap arr[i] to arr[j]
            if(arr[j] <= pivot ){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //now swap arr[i+1] to arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        //Eventually entire array to the left of pivot shall be less than or equal.
        return i+1;
    }

    public static int[] sort(int arr[], int low, int high){

        if(low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] list = new int[]{9,5,4,1,7,2, 3, 6};
        System.out.println(" Before Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
        System.out.println();
        System.out.println("Before ::" + java.time.LocalTime.now());

        sort(list, 0, list.length-1);

        System.out.println("After  ::" +java.time.LocalTime.now());
        System.out.println();
        System.out.println("After Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }

    }
}
