package study.algorithm.baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;

public class CalculateRangeSum {
    private List<Integer> rangeSum = new ArrayList<>();

    public CalculateRangeSum(int numberCount, int[] numbers) {
        rangeSum.add(0);
        for (int index = 1; index <= numberCount; index++) {
            rangeSum.add(rangeSum.get(index - 1) + numbers[index - 1]);
        }
    }

    public int calculateRange(int start, int last) {
        return rangeSum.get(last) - rangeSum.get(start - 1);
    }
}
