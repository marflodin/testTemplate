package com.marflo.testtemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();
    int[] arrayToRotate;
    int[] numberOfStepsToRotate;
    int[] expectedResult;

    public RotateArrayTest(int[] arrayToRotate, int[] numberOfStepsToRotate, int[] expectedResult) {
        this.arrayToRotate = arrayToRotate;
        this.numberOfStepsToRotate = numberOfStepsToRotate;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<int[][]> data() {
        List<int[][]> parameters = new ArrayList<>();
        parameters.add(new int[][]{{1,2,3}, {1}, {3,1,2}});
        parameters.add(new int[][]{{1,2,3}, {2}, {2,3,1}});
        parameters.add(new int[][]{{1,2,3}, {3}, {1,2,3}});
        parameters.add(new int[][]{{1,2,3}, {4}, {3,1,2}});
        return parameters;
    }

    @Test
    public void rotateArraysSuccessfully() throws Exception {
        int[] returnedResult = rotateArray.rotate(arrayToRotate, numberOfStepsToRotate[0]);
        assertThat(returnedResult, is(expectedResult));
    }
}
