package com.marflo.testtemplate;

public class ReversePolishNotation {

    public int calcultate(char[] charArray) {
        int  result = 0;
        int previousNumber;
        for(int position = 0; position < charArray.length; position++) {
            if ((position % 2) == 0)
                previousNumber = Character.getNumericValue(charArray[position]);
        }
        return 0;
    }
}
