package study.algorithm.programmers.level1;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumDigit {
    public int number;

    public SumDigit(int number) {
        this.number = number;
    }

    public int sum() {
        List<Integer> digitNumbers = getDigitNumbers();
        int result = 0;

        for (Integer digitNumber : digitNumbers) {
            result = result + digitNumber;
        }
        return result;
    }

    private final List<Integer> getDigitNumbers() {
        String stringNumber = String.valueOf(number);
        List<Integer> digitNumbers = stringNumber.chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());

        return Collections.unmodifiableList(digitNumbers);
    }
}