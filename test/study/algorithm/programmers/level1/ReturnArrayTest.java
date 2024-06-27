package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("자연수 뒤집어 배열로 만들기 테스트")
public class ReturnArrayTest {
    private IntArray intArray;

    @BeforeEach
    void setUp() {
        intArray = new IntArray();
    }

    @Test
    @DisplayName("자연수 n을 뒤집어 배열로 리턴한다.")
    void returnArray() {
        long n = 12345;

        int[] array = intArray.of(n);
        int[] reversArray = intArray.revers(array);

        Assertions.assertThat(reversArray).containsExactly(5, 4, 3, 2, 1);
    }

    @Test
    @DisplayName("자연수의 개수가 한개일 때 배열로 리턴한다.")
    void returnArray_numberOne() {
        long n = 1;

        int[] array = intArray.of(n);
        int[] reversArray = intArray.revers(array);

        Assertions.assertThat(reversArray).containsExactly(1);
    }

    @Test
    @DisplayName("입력 값이 100억일 때 배열로 리턴한다.")
    void returnArray_100억() {
        long n = 10000000000L;

        int[] array = intArray.of(n);
        int[] reversArray = intArray.revers(array);

        Assertions.assertThat(reversArray).containsExactly(0,0,0,0,0,0,0,0,0,0,1);
    }
}
