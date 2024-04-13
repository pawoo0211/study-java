package study.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class SumFactors {
    private final int number;
    private final int lastDivision;

    public SumFactors(int number) {
        this.number = number;
        lastDivision =  number / 2;
    }

    public int sum() {
        int result = 0;
        List<Integer> factors = findFactors();
        for (Integer factor : factors) {
            result = result + factor;
        }
        return result;
    }

    public List<Integer> findFactors() {
        List<Integer> factors = initializeFactors();
        for (int division = 2; division <= lastDivision; division++) {
            if (number % division == 0) {
                factors.add(division);
            }
        }
        return factors;
    }

    private List<Integer> initializeFactors() {
        List<Integer> factors = new ArrayList<>();
        if (number > 1) {
            factors.add(1);
        }
        factors.add(number);
        return factors;
    }
}
