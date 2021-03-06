package com.harsha.hackerrank.interview.arrays;

/**
 * You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
 * For example, given the array  we perform the following steps:
 *
 * i   arr                         swap (indices)
 * 0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
 * 1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
 * 2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
 * 3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
 * 4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
 * 5   [1, 2, 3, 4, 5, 6, 7]
 * It took  swaps to sort the array.
 *
 * Function Description
 *
 * Complete the function minimumSwaps in the editor below. It must return an integer representing the minimum number of swaps to sort the array.
 * minimumSwaps has the following parameter(s):
 *
 * arr: an unordered array of integers
 * Input Format
 *
 * The first line contains an integer, , the size of .
 * The second line contains  space-separated integers .
 *
 * Constraints
 * Output Format
 *
 * Return the minimum number of swaps to sort the given array.
 *
 * Sample Input 0
 *
 * 4
 * 4 3 1 2
 * Sample Output 0
 *
 * 3
 * Explanation 0
 *
 * Given array
 * After swapping  we get
 * After swapping  we get
 * After swapping  we get
 * So, we need a minimum of  swaps to sort the array in ascending order.
 *
 * Sample Input 1
 *
 * 5
 * 2 3 4 1 5
 * Sample Output 1
 *
 * 3
 * Explanation 1
 *
 * Given array
 * After swapping  we get
 * After swapping  we get
 * After swapping  we get
 * So, we need a minimum of  swaps to sort the array in ascending order.
 *
 * Sample Input 2
 *
 * 7
 * 1 3 5 2 4 6 7
 * Sample Output 2
 *
 * 3
 * Explanation 2
 *
 * Given array
 * After swapping  we get
 * After swapping  we get
 * After swapping  we get
 * So, we need a minimum of  swaps to sort the array in ascending order.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumSwapsTwo {
    private static int minimumSwaps(int[] arr) {
     // Storing element values and give poisition in array.
     HashMap<Integer, Integer> nodeMaps = new HashMap<Integer, Integer>();
     //tracking elements visited. default value will be false.
     boolean isVisited[] = new boolean[arr.length+1];
     //This for loop is for initializing hashmap
     for(int i =1; i< isVisited.length; i++){
         nodeMaps.put(i, arr[i-1]);
     }
     int swapCount = 0;
     // Iterating each element
        for(int k =1; k< nodeMaps.size(); k++){
            int nextNode;
            // checking is visited or not
            if(isVisited[k] == false){
                //If not visited then mark as true
                isVisited[k] = true;
                //Compare element position with element value.
                if(k == nodeMaps.get(k)){
                    continue;
                }else{
                    int c = nodeMaps.get(k);

                    while(!isVisited[c]){
                        isVisited[c] = true;
                        nextNode = nodeMaps.get(c);
                        c = nextNode;
                        ++swapCount;
                    }
                }
            }
        }
        System.out.println(swapCount);
        return swapCount;
    }
/*
    // Complete the minimumSwaps function below.
    private static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i <arr.length - 1; i++) {
             System.out.println( arr[i] + " :: "+ (i+1) );
            if (arr[i] != i + 1) {
                if (((i - 1) >= 0) && arr[i - 1] == (i + 1)) {
                    swapCount++;
                    swap(arr, i, i - 1);
                } else if (((i - 2) >= 0) && arr[i - 2] == (i + 1)) {
                    swapCount += 2;
                    swap(arr, i - 2, i - 1);
                    swap(arr, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return -1;
                }
            }

        }
        System.out.println(swapCount);
        return swapCount;
    }


    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
*/
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

