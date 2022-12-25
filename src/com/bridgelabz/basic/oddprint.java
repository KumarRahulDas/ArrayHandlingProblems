package com.bridgelabz.basic;

public class oddprint {
    public static void main(String[] args)
    {
//declaring variable and initialize variables
        int [] a = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Elements in an array present on odd position are");
//printing the values at odd postion in an array[].
        for (int i = 0; i < a.length; i = i+2)
        {
//Printing result..
            System.out.print(a[i] + " ");
        }
    }
}
