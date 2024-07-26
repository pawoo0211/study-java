package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("피보나치 테스트")
public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void case1() {
        String input = "5";
        String answer = "5 3";

        Assertions.assertThat(fibonacci.compare(input)).isEqualTo(answer);
    }

    @Test
    void case2() {
        String input = "30";
        String answer = "832040 28";

        Assertions.assertThat(fibonacci.compare(input)).isEqualTo(answer);
    }
}
