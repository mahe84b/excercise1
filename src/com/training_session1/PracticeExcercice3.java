package com.training_session1;

/*
EXercise3:
Write a program to check if a given letter is present in a given word.
*/

public class PracticeExcercice3 extends Main{

    String FindWordInGivenString()
    {
        return this.test_string.indexOf(this.test_word) != -1 ? "The word "+this.test_word+" Exists in given string" : "The word this Does Not Exist in given string";
    }
}
