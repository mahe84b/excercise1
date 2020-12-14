package com.training_session3;

/*
Ex1)
Given an array A of 1 dim, find a new array formed by adding each element of the given array with the largest element in the new array to its left.

Examples:
Input: arr[] = {5, 1, 6, -3, 2}
Output: {5, 6, 12, 9, 14}
*/


public class PracticeExcercice1 extends Main {

    int[] SummingElementsToLeft()
    {
        int[] input_array = {5, 1, 6, -3, 2};

        int[] output_array = new int[input_array.length];

        int incremental_sum = 0;

        for(int i=0; i<input_array.length; i++)
        {
            output_array[i] = incremental_sum += input_array[i];
        }

        return output_array;
    }
}
