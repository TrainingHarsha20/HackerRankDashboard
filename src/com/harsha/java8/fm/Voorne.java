package com.harsha.java8.fm;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Fannie mae  Stream Example
 */
public class Voorne {


    public static  void main(String[] args){

        List<Student> students = new ArrayList();
        Student st = new Student();
        st.setName("first");
        students.add(st);

        System.out.println( " ####### Executing lazy Intermediate opertations() : ############");
        Stream<String> studentStream = students.stream()
                .map(student -> {
                    System.out.printf("In Map: %s\n", student.getName());
                    return student.getName().toUpperCase();
                });

        System.out.println("After map statement");

        try{
            Thread.sleep(5);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println( "Thread is in Running state now");

        List<String> studentListFromStream = studentStream.collect(Collectors.toList());
        for(String s:studentListFromStream){
            System.out.println(s);
        }

        System.out.println( " ####### Ending the Executing lazy Intermediate opertations() : ############");


    }

    static class Student{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;
    }
}


