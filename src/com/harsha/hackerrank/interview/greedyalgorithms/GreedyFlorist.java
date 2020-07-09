package com.harsha.hackerrank.interview.greedyalgorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GreedyFlorist {
    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        int cost =0, count =0;

        if(k == c.length){
            cost = Arrays.stream(c).sum();
        }else if(c.length > k){
            Integer a[] = new Integer[c.length];

            for(int i=0; i<a.length; i++)
                a[i] = c[i];
            //sorting in descending order
            Arrays.sort(a, (i,j) -> j-i);

//            Arrays.sort(a, (i,j)-> j - i );
//            Arrays.stream(a).forEach(System.out::println);
            int i =0;
            for(i=0;i<k;i++){
                cost+= a[i];
                System.out.println("cost :: " + cost);
            }
            int prev = 1, curr =0;
            System.out.println( " Value of i :: " + i);
            for(; i<c.length;i++){
                System.out.println(" last for loop initial cost:: " + cost + " :: "+ a[i]);
                cost = cost+((prev + 1) * a[i]);
                System.out.println(" last for loop :: " + cost);
                ++count;
                if(count == k) {
                    count =0;
                    prev++;
                }
            }
        }
        System.out.println( cost);
        return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
