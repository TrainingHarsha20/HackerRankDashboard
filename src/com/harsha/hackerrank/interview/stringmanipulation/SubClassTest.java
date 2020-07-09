package com.harsha.hackerrank.interview.stringmanipulation;

public class SubClassTest {
    AccessModiferTest amt = new AccessModiferTest();

    String getType(){
        amt.defaultAMTest();
        amt.protectAMTest();
        return "both works in subclasses";
    }
}
