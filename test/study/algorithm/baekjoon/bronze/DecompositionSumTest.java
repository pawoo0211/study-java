package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("분해합 테스트")
public class DecompositionSumTest {
    private DecompositionSum decomposition;

    @BeforeEach
    void setUp() {
        decomposition = new DecompositionSum();
    }

    @Test
    void case1() {
        String input = "256";
        String answer = "245";

        Assertions.assertThat(decomposition.calculate(input)).isEqualTo(answer);
    }

    @Test
    void case2() {
        String input = "216";
        String answer = "198";

        Assertions.assertThat(decomposition.calculate(input)).isEqualTo(answer);
    }
}
