package com.harsha.hackerrank.interview.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to  at the back.
 * Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if  and  bribes , the queue will look like this: .
 *
 * Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!
 *
 * Function Description
 *
 * Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.
 *
 * minimumBribes has the following parameter(s):
 *
 * q: an array of integers
 * Input Format
 *
 * The first line contains an integer , the number of test cases.
 *
 * Each of the next  pairs of lines are as follows:
 * - The first line contains an integer , the number of people in the queue
 * - The second line has  space-separated integers describing the final state of the queue.
 *
 * Constraints
 *
 * Subtasks
 *
 * For  score
 * For  score
 *
 * Output Format
 *
 * Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than  people.
 *
 * Sample Input
 *
 * 2
 * 5
 * 2 1 5 3 4
 * 5
 * 2 5 1 3 4
 * Sample Output
 *
 * 3
 * Too chaotic
 * Explanation
 *
 * Test Case 1
 *
 * The initial state:
 *
 * pic1(1).png
 *
 * After person  moves one position ahead by bribing person :
 *
 * pic2.png
 *
 * Now person  moves another position ahead by bribing person :
 *
 * pic3.png
 *
 * And person  moves one position ahead by bribing person :
 *
 * pic5.png
 *
 * So the final state is  after three bribing operations.
 *
 * Test Case 2
 *
 * No person can bribe more than two people, so its not possible to achieve the input state
 */

public class NewYearChaos {

/*
    static int minimumBribes(int[] arr) {

        HashMap<Integer, Integer> nodeMaps = new HashMap<>();
        boolean isVisited[] = new boolean[arr.length+1];

        for(int i=1; i< isVisited.length; i++){
            nodeMaps.put(i, arr[i-1]);
        }
        int bribeCount = 0;
        for(int idx =1; idx<nodeMaps.size(); idx++) {
            int nextNode;
            // checking is visited or not
            if (isVisited[idx] == false) {
                isVisited[idx] = true;
                if (idx == nodeMaps.get(idx)) {
                    continue;
                } else {
                    int val = nodeMaps.get(idx);
                    while(!isVisited[val]){
                        isVisited[val] = true;
                        nextNode = nodeMaps.get(val);
                        val = nextNode;
                        ++bribeCount;
                    }
                }
            }
        }
        System.out.println(bribeCount);
        return bribeCount;
    }
*/


    // Complete the minimumBribes function below.
    static void minimumBribes(int[] arr) {
        int swapCount = 0;
       for (int i = arr.length - 1; i >= 0; i--) {
           //position is not matching idx then go inside
           if (arr[i] != i + 1) {
               if (arr[i - 1] == (i+1)) {
                   swapCount++;
                   swap(arr, i, i - 1);
               } else if (arr[i - 2] == (i+1)) {
                   swapCount += 2;
                   swap(arr, i - 2, i - 1);
                   swap(arr, i - 1, i);
               } else {
                   System.out.println("Too chaotic");
                   return;
               }
           }
       }
        System.out.println( swapCount);
    }
    static void swap(int[] a,int t,int i ){
        int temp=a[t];
        a[t]=a[i];
        a[i]=temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];
            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }
        scanner.close();
    }
}
