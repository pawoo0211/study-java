package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

@DisplayName("약수의 합")
public class SumFactorsTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,5,10})
    void findFactors_input_10(int expected) {
        SumFactors sumFactors = new SumFactors(10);
        List<Integer> factors = sumFactors.findFactors();
        Assertions.assertThat(factors.contains(expected)).isTrue();
    }

    @Test
    void sum_input_10() {
        SumFactors sumFactors = new SumFactors(10);
        Assertions.assertThat(sumFactors.sum()).isEqualTo(18);
    }

    @Test
    void sum_input_12() {
        SumFactors sumFactors = new SumFactors(12);
        Assertions.assertThat(sumFactors.sum()).isEqualTo(28);
    }

    @Test
    void sum_input_5() {
        SumFactors sumFactors = new SumFactors(5);
        Assertions.assertThat(sumFactors.sum()).isEqualTo(6);
    }
}