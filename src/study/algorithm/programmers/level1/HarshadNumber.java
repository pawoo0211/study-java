package study.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class HarshadNumber {
    private final int number;
    private int sumDigitResult;

    public HarshadNumber(int number) {
        this.number = number;
    }

    public boolean isHashadNumber() {
        sumDigit();
        return number % sumDigitResult == 0;
    }

    public void sumDigit() {
        List<Integer> digits = divideNumber();
        for (Integer digit : digits) {
            sumDigitResult += digit;
        }
    }

    private List<Integer> divideNumber() {
        String stringNumber = String.valueOf(number);
        return Arrays.stream(
                stringNumber.split(""))
                .map(v -> Integer.valueOf(v))
                .collect(Collectors.toList()
                );
    }

    public int getSumDigitResult() {
        return sumDigitResult;
    }
}
