package com.harsha.java8.fm;

public class PersonFinalTest {

    public static void main(String[] args) {
        PersonFinal a = new PersonFinal("test1", "test1");

        System.out.println(a.fname + " :: " + a.lName );
        a.fname="test2";
        a.lName="test2";
        System.out.println(a.fname + " :: " + a.lName );


    }
}
