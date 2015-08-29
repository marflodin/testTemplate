package com.marflo.testtemplate;

public class RotateArray {

    public int[] rotate(int[] nums, int k) {
        int[] resultArray = new int[nums.length];
        for(int position=0; position < nums.length; position++) {
            int positionInResultArray = (k + position) % nums.length;
            resultArray[positionInResultArray] = nums[position];
        }
        return resultArray;
    }
}
