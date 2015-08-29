package com.marflo.testtemplate;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsAdder {

    public int[] add(int[] number1, int[] number2) {
        int maxPosition = Math.max(number1.length, number2.length) - 1;
        int[] adjustedNumber1 = getNumberWithZerosForEmptyPositions(number1, maxPosition);
        int[] adjustedNumber2 = getNumberWithZerosForEmptyPositions(number2, maxPosition);
        List<Integer> resultList = getAddedResult(adjustedNumber1, adjustedNumber2, maxPosition);
        return resultList.stream().mapToInt(i->i).toArray();
    }

    private int[] getNumberWithZerosForEmptyPositions(int[] number, int size) {
        if (size >= number.length) {
            return getAdjustedNumber(number, size);
        } else
            return number;
    }

    private int[] getAdjustedNumber(int[] number, int size) {
        int [] adjustedNumber = new int[size+1];
        int sizeDifference = size - number.length + 1;
        int index = 0;
        for (int reversedIndex = size; reversedIndex >= 0; reversedIndex--) {
            if (reversedIndex >= number.length)
                adjustedNumber[index] = 0;
            else
                adjustedNumber[index] = number[index-sizeDifference];
            index++;
        }
        return adjustedNumber;
    }

    private List<Integer> getAddedResult(int[] number1, int[] number2, int numberSize) {
        List<Integer> result = new ArrayList<>();
        int carryOver = 0;
        for (int position = numberSize; position >= 0; position--) {
            int resultAtPosition = number1[position] + number2[position] + carryOver;
            if (resultAtPosition > 9) {
                carryOver = 1;
                resultAtPosition -= 10;
            } else
                carryOver = 0;
            result.add(0, resultAtPosition);
        }
        if (carryOver > 0)
            result.add(0, carryOver);
        return handleEndingZeros(result);
    }

    private List<Integer> handleEndingZeros(List<Integer> list) {
        while (list.size() > 0)
            if (list.get(0).equals(0))
                list.remove(0);
            else
                break;
        return list;
    }
}
