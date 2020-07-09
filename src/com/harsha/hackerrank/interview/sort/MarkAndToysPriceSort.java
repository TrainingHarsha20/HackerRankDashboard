package com.harsha.hackerrank.interview.sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarkAndToysPriceSort {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int newPrice =0, numberOfToys = 0;

        if(k ==0 || prices.length == 0) return 0;

        Arrays.sort(prices);
        for(int i=0; i< prices.length; i++){
            if((k-newPrice)>= prices[i]){
                newPrice += prices[i];
                numberOfToys++;
            }
        }
        System.out.println(numberOfToys);
        return numberOfToys;

       /* int newPrice =0, numberOfToys = 0;
        if(k ==0 || prices.length == 0) return 0;
        Arrays.sort(prices);

        for(int i=0; i< prices.length; i++){
            if(k>= prices[i] && (k-newPrice)>= prices[i]){
                long newV = prices[i];
                Math.min(newPrice,newV);
                newPrice += prices[i];
                System.out.println(prices[i]);
                numberOfToys++;
            }
        }
        System.out.println(numberOfToys);
        return numberOfToys;*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(System.getenv("OUTPUT_PATH"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

