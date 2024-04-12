package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

@DisplayName("약수의 합")
public class SumFactorsTest {

    @Test
    void inputZero() {
        SumFactors sumFactors = new SumFactors(0);
        System.out.println(sumFactors.getLastDivision());
    }

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

    class SumFactors {
        private final int number;
        private final int lastDivision;

        public SumFactors(int number) {
            this.number = number;
            lastDivision =  number / 2;
        }

        public List<Integer> findFactors() {
            List<Integer> factors = new ArrayList<>();
            factors.add(1);
            factors.add(number);
            for (int division = 2; division <= lastDivision; division++) {
                if (number % division == 0) {
                    factors.add(division);
                }
            }
            return factors;
        }

        public int sum() {
            int result = 0;
            List<Integer> factors = findFactors();
            for (Integer factor : factors) {
                result = result + factor;
            }
            return result;
        }

        public int getLastDivision() {
            return lastDivision;
        }
    }
}