package study.algorithm.baekjoon.silver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.algorithm.baekjoon.bronze.CalculateRangeSum;


public class CalculateRangeSumTest {

    @Test
    void case1() {
        int numberCount = 5;
        int[] numbers = {5, 4, 3, 2, 1};

        // 구간 합 계산
        CalculateRangeSum rangeSum = new CalculateRangeSum(numberCount, numbers);

        Assertions.assertThat(rangeSum.calculateRange(1, 3)).isEqualTo(12);
        Assertions.assertThat(rangeSum.calculateRange(2, 4)).isEqualTo(9);
        Assertions.assertThat(rangeSum.calculateRange(5, 5)).isEqualTo(1);
    }
}
