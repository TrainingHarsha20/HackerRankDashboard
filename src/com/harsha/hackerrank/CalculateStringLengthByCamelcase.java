package com.harsha.hackerrank;

public class CalculateStringLengthByCamelcase {

    public static void main(String[] args) {
	// write your code here
     String s = "saveChangesInTheEditor";
     String[] r = s.split("(?=\\p{Upper})");
     System.out.println(" Length :  " + r.length);
    }
}
