package com.harsha.hackerrank.interview;

import java.util.ArrayList;

public class PrimeNumbers {

    public static int countPrimes(int n) {

        ArrayList<Integer> primes = new ArrayList<Integer>();

        if(n<=1) return 0;
        if(n==2) return 1;
        if(n==3) return 2;

        primes.add(2);
        primes.add(3);

        for(int i=4; i<=n; i++){
            if(isPrimeCheck(primes, i, true)){
                primes.add(i);
            }
        }
        return primes.size();
    }

    private static boolean isPrimeCheck(ArrayList<Integer> primes, int i, boolean isPrime) {

        for(int p: primes){
            if(i%p==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main (String[] args)
    {
        System.out.println( " count :: " +  countPrimes(11) );
        System.out.println( " count :: " +  countPrimes(10000) );
    }
}
