package com.marflo.testtemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class ReversePolishNotationTest {
    ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
    char[] input;
    int expectedResult;

    public ReversePolishNotationTest(char[] input, int expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new char[]{'a'}, 1 },
                { new char[]{'a'}, 2 },
                { new char[]{'a'}, 3 },
                { new char[]{'a'}, 4 },
                { new char[]{'a'}, 5 }
        });
    }

    @Test
    public void performCalculationSuccess() throws Exception {
        System.out.println(input + " " + expectedResult);
/*        int returnedResult = reversePolishNotation.calcultate(input);
        assertThat(returnedResult, is(expectedResult));*/
    }
}
