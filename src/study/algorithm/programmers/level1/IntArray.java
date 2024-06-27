package study.algorithm.programmers.level1;

import java.util.Arrays;

public class IntArray {

    public <T extends Number> int[] of(T number) {
        String stringNumber = String.valueOf(number);
        return Arrays.stream(stringNumber.split(""))
                .mapToInt(thisNumber -> Integer.valueOf(thisNumber))
                .toArray();
    }

    public int[] revers(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength / 2; i++) {
            int preNumber = array[i];
            int lastNumber = array[(arrayLength - 1) - i];

            array[i] = lastNumber;
            array[(arrayLength - 1) - i] = preNumber;
        }

        return array;
    }
}
