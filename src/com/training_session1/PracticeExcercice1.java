package com.training_session1;

/*
EXercise1:
Implement in two different ways string length without using function length().
*/

public class PracticeExcercice1 extends Main{

    int StringlengthByStringFunction()
    {
        return this.test_string.length();
    }

    int StringlengthBycharAtFunction()
    {
      int length_needle = 0;

      while(true)
      {
          try {
            this.test_string.charAt(length_needle);
          }
          catch (Exception e) {
            return length_needle;
          }

          length_needle++;
      }
    }

    int StringlengthByToCharArray()
    {
        int length_needle = 0;

        for (char c : this.test_string.toCharArray()) {
            length_needle++;
        }

        return length_needle;
    }

    int StringlengthBycodePointAt()
    {
        int length_needle = 0;

        while(true)
        {
            try {
                this.test_string.codePointAt(length_needle);
            }
            catch (Exception e) {
                return length_needle;
            }

            length_needle++;
        }
    }
}
