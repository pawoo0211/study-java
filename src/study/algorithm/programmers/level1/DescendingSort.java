package study.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingSort {

    public static long sort(long number) {
        String stringNumber = String.valueOf(number);
        String result =  Arrays.stream(stringNumber.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        return Long.parseLong(result);
    }
}
