package com.training_session1;

/*
EXercise2
Returns the how many words in a text line.
*/

public class PracticeExcercice2 extends Main{

    int GetNumberOfWordsWithSplitFunction()
    {
        String[] number_of_words_array = this.test_string.split(" ");
        return number_of_words_array.length;
    }
}
