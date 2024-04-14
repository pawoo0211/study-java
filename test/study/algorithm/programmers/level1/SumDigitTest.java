package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

@DisplayName("자릿수 더하기")
public class SumDigitTest {

    @Test
    void case1() {
        SumDigit sumDigit = new SumDigit(123);
        Assertions.assertThat(sumDigit.sum()).isEqualTo(6);
    }

    @Test
    void case2() {
        SumDigit sumDigit = new SumDigit(987);
        Assertions.assertThat(sumDigit.sum()).isEqualTo(24);
    }
}