package com.harsha.hackerrank.interview.greedyalgorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LuckBalance {
    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int luckCount = 0;
        Arrays.sort(contests, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                return -1 * Integer.compare(a[0], b[0]);
            }
        });

        for(int i=0; i<contests.length; i++){
            int luck = contests[i][0];
            int importance = contests[i][1];
            if(importance == 1 && k > 0){
                k--;
                luckCount += luck;
            }else if(importance == 1 && k == 0){
                luckCount -= luck;
            }
            if(importance == 0){
                luckCount += luck;
            }
        }
        System.out.println(luckCount);
        return luckCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}