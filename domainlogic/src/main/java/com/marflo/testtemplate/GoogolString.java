package com.marflo.testtemplate;

public class GoogolString {

    public String switchString(String inputString) {
        String outputString = "";
        for (char ch : inputString.toCharArray()){
            if (ch == '0')
                outputString +="1";
            else if (ch == '1')
                outputString +="0";
        }
        return outputString;
    }
}
