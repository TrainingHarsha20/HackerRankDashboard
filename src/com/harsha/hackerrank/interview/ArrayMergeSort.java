package com.harsha.hackerrank.interview;

public class ArrayMergeSort {

    //    {9,5,4,1,7,2,11, 3, 6};
    static long mergeSort(int[] a,int[] temp, int leftStart, int rightEnd){
        if(leftStart >= rightEnd) return 0;
        int mid = (leftStart + rightEnd) / 2;
        mergeSort(a,temp,leftStart,mid);
        mergeSort(a,temp,mid+1,rightEnd);
        int fc = mergeCombine(a, temp, leftStart, mid, rightEnd);
        return fc;
    }

    private static int mergeCombine(int[] a, int[] temp, int leftStart, int mid, int rightEnd) {
        int leftEnd = mid;
        int rightStart = mid+1;
        int size = rightEnd - leftStart +1;
        int left = leftStart, right = rightStart, index = leftStart;

        /*int s1= mid-leftStart+1;
        int s2 = rightEnd-mid;

        int[] lArr = new int[s1];
        int[] rArr = new int[s2];
        for(int i =0; i< s1; i++){
            lArr[i] = a[i];
        }

        for(int j =0; j< s2; j++){
            rArr[j] = a[mid+1+j];
        }

        int i=0, j=0;
        int k = leftStart;
        while(i < s1 && j < s2){
            if(lArr[i]<= rArr[j]){
                a[k] = lArr[i];
                i++;
            }else{
                a[k] = rArr[j];
                j++;
            }
            k++;
        }*/
        while(left <= leftEnd && right <= size){
            if(a[left] < a[right]){
                temp[index] = a[left];
                left++;
            }else{
                temp[index] = a[right];
                right++;
            }
            index++;
        }

/*
        System.arraycopy(a, left ,temp, index, leftEnd - left +1);
        System.arraycopy(a, right ,temp, index, size - right);
        System.arraycopy(temp, leftStart, a, leftStart ,size);
        */
        return 0;
    }

    public static void main(String[] args){
        int[] list = new int[]{9,5,4,1,7,2, 3, 6};
//        int[] list = new int[]{9,5,4,1,7,2,11, 3, 6};
        System.out.println(" Before Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
        System.out.println();
        System.out.println("Before ::" + java.time.LocalTime.now());

        mergeSort(list, new int[list.length],0, list.length-1);

        System.out.println("After  ::" +java.time.LocalTime.now());
        System.out.println();
        System.out.println("After Sort");
        for(int i=0;i<list.length ;i++){
            System.out.print(" " +list[i]);
        }
    }

}
