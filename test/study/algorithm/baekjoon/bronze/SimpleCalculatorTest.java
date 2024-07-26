package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

@DisplayName("긴자리 계산")
public class SimpleCalculatorTest {

    @Test
    void case1() {
        String numberOne = "1";
        String numberTwo = "-1";
        SimpleCalculator calculator = new SimpleCalculator(numberOne, numberTwo);

        Assertions.assertThat(calculator.add()).isEqualTo("0");
        Assertions.assertThat(calculator.subtract()).isEqualTo("2");
        Assertions.assertThat(calculator.multiply()).isEqualTo("-1");
    }

    class SimpleCalculator {
        private BigDecimal number1;
        private BigDecimal number2;

        public SimpleCalculator(String numberOne, String numberTwo) {
            number1 = new BigDecimal(numberOne);
            number2 = new BigDecimal(numberTwo);
        }

        public String add() {
            return String.valueOf(number1.add(number2));
        }

        public String subtract() {
            return String.valueOf(number1.subtract(number2));
        }

        public String multiply() {
            return String.valueOf(number1.multiply(number2));
        }
    }
}
