package com.marflo.testtemplate;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RotateArray2Test {

    RotateArray rotateArray = new RotateArray();

    public Object[] basicTestData() {
        return new Object[][]{
                {new int[]{1,2,3}, 1, new int[]{3,1,2}},
                {new int[]{1,2,3}, 2, new int[]{2,3,1}},
                {new int[]{1,2,3}, 3, new int[]{1,2,3}},
                {new int[]{1,2,3}, 4, new int[]{3,1,2}}
        };
    }
    @Test
    @Parameters(method = "basicTestData")
    public void rotateArraysSuccessfully(int[] arrayToRotate, int numberOfStepsToRotate,
                                         int[] expectedResult) throws Exception {

        int[] returnedResult = rotateArray.rotate(arrayToRotate, numberOfStepsToRotate);
        assertThat(returnedResult, is(expectedResult));
    }
}
