package com.harsha.java8.forloop.withoutfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        // create a Optional
//        Optional<Integer> op = Optional.of(9455);
        Optional<Integer> op = Optional.empty();//of(9455);

        // print supplier
        System.out.println("Optional: "+ op);

        // orElseGet supplier
        System.out.println("Value by orElseGet (Supplier) method: "
                + op.orElseGet(() -> (int)(Math.random() * 10)));
    }

}
