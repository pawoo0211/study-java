package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.*;

@DisplayName("정수 내림차순 정렬 테스트")
public class DescendingSortTest {

    @Test
    @DisplayName("입력된 값을 큰 것부터 작은 순서대로 정렬한다.")
    void sort() {
        long n = 118372;

        long result = DescendingSort.sort(n);

        long answer = 873211;
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    @DisplayName("숫자 1을 정렬한다.")
    void sort_numberOne() {
        long n = 1;

        long result = DescendingSort.sort(n);

        long answer = 1;
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    @DisplayName("한계 값을 정렬한다.")
    void sort_limitNumber() {
        long n = 8000000000L;

        long result = DescendingSort.sort(n);

        long answer = 8000000000L;
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
