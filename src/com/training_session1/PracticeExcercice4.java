package com.training_session1;

/*
EXercise4:
Write a program to capitalize the first letter in each word in a text.
Exp: “Hello you, how are you?” → “Hello You, How Are You?”
*/

import java.util.Locale;

public class PracticeExcercice4 extends Main{

    StringBuffer CapitalizeFirstLetter()
    {
        String[] test_string_array = this.test_string.split(" ");

        StringBuffer output_string = new StringBuffer();

        String split_word;

        char first_char;

        char first_char_to_upper;

        for(int i=0; i < test_string_array.length; i++)
        {
            split_word = test_string_array[i].toLowerCase();

            first_char = split_word.charAt(0);

            first_char_to_upper = Character.toUpperCase(first_char);

            output_string.append(split_word.replaceFirst(Character.toString(first_char), Character.toString(first_char_to_upper)) + " ");
        }

        return output_string;
    }
}
