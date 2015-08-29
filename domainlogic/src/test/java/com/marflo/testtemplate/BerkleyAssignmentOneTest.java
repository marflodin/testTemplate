package com.marflo.testtemplate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BerkleyAssignmentOneTest {

    BerkleyAssignmentOne berkleyAssignmentOne = new BerkleyAssignmentOne();
    int numberOfCubes;
    int expectedResult;
    List<int[]> cubeList = new ArrayList<>();

    @Test
    public void testInputOne() throws Exception {
        numberOfCubes = 2;
        expectedResult = 25;
        cubeList = new ArrayList<>();
        cubeList.add(new int[]{0, 0, 0, 10});
        cubeList.add(new int[]{9, 1, 1, 5});
        int actualResult = berkleyAssignmentOne.computeVolume(numberOfCubes, cubeList);
        assertThat(actualResult, is(expectedResult));
    }

    @Test
    public void testInputTwo() throws Exception {
        numberOfCubes = 3;
        expectedResult = 9;
        cubeList = new ArrayList<>();
        cubeList.add(new int[]{0, 0, 0, 10});
        cubeList.add(new int[]{9, 1, 1, 5});
        cubeList.add(new int[]{8, 2, 2, 3});
        int actualResult = berkleyAssignmentOne.computeVolume(numberOfCubes, cubeList);
        assertThat(actualResult, is(expectedResult));
    }
}
