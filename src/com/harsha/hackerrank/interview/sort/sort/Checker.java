package com.harsha.hackerrank.interview.sort.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {

        int r1 = b.score - a.score;
        int r2 = a.name.compareTo(b.name);
         System.out.println( "score : " + r1 + " name :" + r2);
        if (r1 == 0){
            return r2;
        }
        return r1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
