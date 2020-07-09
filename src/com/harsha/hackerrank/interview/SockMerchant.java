package com.harsha.hackerrank.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SockMerchant {
    static int[] ar = {1,2,1,2,1,3,2};

    public static void main(String[] args) {
        AtomicInteger counter= new AtomicInteger();
        Set<Integer> pairSer = new HashSet<>();
/*
//        old code
        for(int i=0; i< ar.length; i++){
            System.out.print( "ar[i] " + ar[i]);
            if(!pairSer.contains(ar[i])){
                pairSer.add(ar[i]);
            }else{
                counter++;
                pairSer.remove(ar[i]);
            }
        }
*/
        Arrays.stream(ar).sorted().forEach(e -> {
          if(!pairSer.contains(e)){
              pairSer.add(e);
          }else{
              counter.getAndIncrement();
              pairSer.remove(e);
          }
        });
        System.out.println(counter);
    }
}
