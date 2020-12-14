package com.training_session3;

/*
Ex2
Write a function to find the duplicate values of an array of integer values.
Exp:
Input: int[] a = {1, 2, 5, 5, 6, 6, 7, 2};
Output: Element [2] is duplicated, Element [5] is duplicated, Element [6] is duplicated
*/

import java.util.Arrays;

public class PracticeExcercice2 extends Main {

    boolean FindInArray(final int[] array_to_search, final int value_to_search)
    {
        return Arrays.stream(array_to_search).anyMatch(i -> i == value_to_search);
    }

    StringBuffer FindingDuplicatesInArray()
    {
        int[] input_array = {1, 2, 5, 5, 6, 6, 7, 2};

        int[] single_array = new int[input_array.length];

        StringBuffer output_string = new StringBuffer();

        for(int index=0; index<input_array.length; index++)
        {
            if(FindInArray(single_array, input_array[index]))
                output_string.append("Element ["+input_array[index]+"] is duplicated,");
            else
                single_array[index] = input_array[index];
        }

        if(output_string.length() > 0) {
            output_string.deleteCharAt(output_string.length() - 1);
        }
        return output_string;
    }
}
