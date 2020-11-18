package com.automation.java_traning;

import java.util.*;

public class Traning {
    public static void main(String [] args) {

        Queue<String> queue = new LinkedList<>() {
            {
                this.add("Jeans");
                this.add("Shirts");
            }
        };
        queue.add ("Caps");
        queue.stream().filter(s -> !s.endsWith(s)).forEach(System.out::println);



        String [] numbers = new String[]{"1", "2", "8", "12"};
        for(String element: numbers)
        System.out.println(element.hashCode() + " " + element);


    }


}
