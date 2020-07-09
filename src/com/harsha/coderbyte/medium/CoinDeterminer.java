package com.harsha.coderbyte.medium;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Using the Java language, have the function CoinDeterminer(num) take the input,
 * which will be an integer ranging from 1 to 250, and
 * return an integer output that will specify the least number of coins, that when added, equal the input integer.
 *
 * Coins are based on a system as follows: there are coins representing the integers 1, 5, 7, 9, and 11.
 *
 * So for example: if num is 16, then the output should be 2 because you can achieve the number 16 with the coins 9 and 7.
 * If num is 25, then the output should be 3 because you can achieve 25 with
 * either 11, 9, and 5 coins or with 9, 9, and 7 coins.
 */

public class CoinDeterminer {
    final static int[] coins = new int[] {1, 5, 7, 9, 11};

    static int cDeterminer(int num) {
        int minCount = Integer.MAX_VALUE;
        int counter =0;

        for (int i = coins.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int count = getCoinCount(num, i, j);
                if (count < minCount) {
                    minCount = count;
                }
            }
        }
        return minCount;
    }

    static int getCoinCount(int num, int maxCoinIndex, int startCoinIndex){
            int count = 0;

            if (num >= coins[maxCoinIndex]) {
                num -= coins[maxCoinIndex];
                count++;
            }

            for (int i = startCoinIndex; i >= 0; i--) {
                while (num >= coins[i]) {
                    num -= coins[i];
                    count++;
                }
            }
            return count;
    }


        public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(cDeterminer(s.nextInt()));
    }
}

