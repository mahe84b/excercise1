package com.training_session1;

/*
Exercise5 (with solution):
Swapping Pairs of Characters in a String in Java.
Given string str, the task is to write a Java program to swap the pairs of characters of a string. If the string contains an odd number of characters then the last character remains as it is
*/

public class PracticeExcercice5 extends Main{

    StringBuffer ReverseCharactersInString()
    {
        StringBuffer output_string = new StringBuffer();

        String[] string_array_of_test_string =  this.test_string.split("(?<=\\G.{"+ this.chunk_size+"})");

        for(int i=0; i < string_array_of_test_string.length; i++)
        {
            output_string.append((new StringBuffer(string_array_of_test_string[i])).reverse());
        }

        return output_string;
    }
}
