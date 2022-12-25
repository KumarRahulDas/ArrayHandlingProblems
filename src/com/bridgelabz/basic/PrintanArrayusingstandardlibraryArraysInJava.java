package com.bridgelabz.basic;
import java.util.Arrays;
//toString() method works well for simple arrays, but doesn’t work for multidimensional arrays.
//deepToString(Object[]) method is a java. util. Arrays class method.
// Returns a string representation of the “deep contents” of the specified array.
// If the array contains other arrays as elements, the string representation contains
// their contents and so on.
public class PrintanArrayusingstandardlibraryArraysInJava {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
    }
}
