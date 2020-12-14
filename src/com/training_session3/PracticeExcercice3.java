package com.training_session3;

/*
Ex3
Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e.
fill A with first p smallest elements and fill B with remaining
elements.   Go to the editor
Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
*/

import java.util.Arrays;

public class PracticeExcercice3 extends Main {

    final public void SortAccrossTwoArrays()
    {

        int[] input_array1 = { 1, 5, 6, 7, 8, 10 };

        int[] input_array2 = { 2, 4, 9 };

        int length_of_input_array1 = input_array1.length;

        int length_of_input_array2 = input_array2.length;

        int[] combined_array = new int[length_of_input_array1 + length_of_input_array2];

        System.arraycopy(input_array1, 0, combined_array, 0, length_of_input_array1);

        System.arraycopy(input_array2, 0, combined_array, length_of_input_array1, length_of_input_array2);

        Arrays.sort(combined_array);

        System.out.println("Sorted Arrays are: ");

        System.out.println(Arrays.toString(Arrays.copyOfRange(combined_array, 0, length_of_input_array1)));

        System.out.println(Arrays.toString(Arrays.copyOfRange(combined_array, length_of_input_array1,length_of_input_array1 + length_of_input_array2)));
    }
}
