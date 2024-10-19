package org.example;

import java.util.*;


public class Main {
    public static <T> void printArray(ArrayList<T> list){
        for(T element: list){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        printArray(new ArrayList<>(Arrays.asList(1,2,3)));
        printArray(new ArrayList<>(Arrays.asList("Hello", "World")));

    }
}