package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("숫자의 합 테스트")
public class SumNumberTest {

    @Test
    void case1() {
        String input = "54321";
        int answer = 15;

        int result = Arrays.stream(input.split(""))
                .map(v -> Integer.valueOf(v))
                .reduce((total, v) -> total + v)
                .orElse(0);

        Assertions.assertThat(result).isEqualTo(answer);
    }
}
