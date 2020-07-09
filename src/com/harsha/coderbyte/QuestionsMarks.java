package com.harsha.coderbyte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionsMarks {
    public static String QuestionsMarks(String str) {
        // code goes here
        String numMarks = str.replaceAll("([0-9])\\1*", "");
        Pattern p = Pattern.compile("(\\d\\?+)");
        Matcher m = p.matcher(str);
        boolean matched = false;
        while (m.find()) {
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));
            if (a + b == 10) {
                if (match.length() != 5) {
                    return "false";
                } else {
                    matched = true;
                }
            }
        }
        return matched ? "true" : "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
//        IP 1 : acc?7??sss?3rr1??????5
    }
}
