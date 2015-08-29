package com.marflo.testtemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class ArrayListsAdderTest {

    ArrayListsAdder arrayListsAdder = new ArrayListsAdder();
    int[] number1;
    int[] number2;
    int[] expectedResult;

    public ArrayListsAdderTest(int[] number1, int[] number2, int[] expectedResult) {
        this.number1 = number1;
        this.number2 = number2;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<int[][]> data() {
        int[][][] parameters = new int[][][]{
                {{1, 0}, {2, 2}, {3, 2}},
                {{9, 9}, {4, 2}, {1, 4, 1}},
                {{1, 0, 1}, {9}, {1, 1, 0}},
                {{0, 0, 0}, {9, 9}, {9, 9}},
                {{0, 0, 0}, {9}, {9}},
                {{0, 1, 0, 1}, {1, 0, 1, 0}, {1, 1, 1, 1}}
        };
        return Arrays.asList(parameters);
    }

    @Test
    public void addTwoArraysOfEqualLength() {
        int[] returnedResult = arrayListsAdder.add(number1,number2);
        assertThat(returnedResult, is(expectedResult));
    }
}
