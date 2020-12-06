package com.training_session1;

import java.util.*;

/*
EXercise1:
Implement in two different ways string length without using function length().
EXercise2:
Returns the how many words in a text line.
EXercise3:
Write a program to check if a given letter is present in a given word.
EXercise4:
Write a program to capitalize the first letter in each word in a text.
Exp: “Hello you, how are you?” → “Hello You, How Are You?”
Exercise5 (with solution):
Swapping Pairs of Characters in a String in Java.
Given string str, the task is to write a Java program to swap the pairs of characters of a string. If the string contains an odd number of characters then the last character remains as it is
 */

public class Main {

    public static String test_string;

    public static String test_word;

    public static int chunk_size;

    public static void main(String[] args) {

        Scanner scanner_object = new Scanner(System.in);

        System.out.print("Enter a string: ");

        test_string= scanner_object.nextLine();

        System.out.print("Enter a word to search in string : ");

        test_word= scanner_object.nextLine();

        System.out.print("Enter chunk size to split string to reverse given string : ");

        chunk_size= scanner_object.nextInt();

        System.out.println("\n ***** EXercise1: Implement in two different ways string length without using function length(). *****");
        PracticeExcercice1 practice_excercice1 = new PracticeExcercice1();
        System.out.println("StringlengthByStringFunction: " + practice_excercice1.StringlengthByStringFunction());
        System.out.println("StringlengthBycharAtFunction: " + practice_excercice1.StringlengthBycharAtFunction());
        System.out.println("StringlengthByToCharArray: " + practice_excercice1.StringlengthByToCharArray());
        System.out.println("StringlengthBycodePointAt: " + practice_excercice1.StringlengthBycodePointAt());

        System.out.println("\n ***** EXercise2: Returns the how many words in a text line.. *****");
        PracticeExcercice2 practice_excercice2 = new PracticeExcercice2();
        System.out.println("GetNumberOfWordsWithSplitFunction: " + practice_excercice2.GetNumberOfWordsWithSplitFunction());

        System.out.println("\n ***** EXercise3: Write a program to check if a given letter is present in a given word. *****");
        PracticeExcercice3 practice_excercice3 = new PracticeExcercice3();
        System.out.println("FindWordInGivenString: " + practice_excercice3.FindWordInGivenString());

        System.out.println("\n ***** EXercise4: Write a program to capitalize the first letter in each word in a text. *****");
        PracticeExcercice4 practice_excercice4 = new PracticeExcercice4();
        System.out.println("CapitalizeFirstLetter: " + practice_excercice4.CapitalizeFirstLetter());

        System.out.println("\n ***** Exercise5: Swapping Pairs of Characters in a String in Java. *****");
        PracticeExcercice5 practice_excercice5 = new PracticeExcercice5();
        System.out.println("ReverseCharactersInString: " + practice_excercice5.ReverseCharactersInString());
    }
}
