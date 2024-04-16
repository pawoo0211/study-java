package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HarshadNumberTest {

    @ParameterizedTest
    @CsvSource(value = {"10:1", "12:3", "11:2", "13:4"}, delimiter = ':')
    void divideNumber(int number, int expected) {
        HarshadNumber harshadNumber = new HarshadNumber(number);
        harshadNumber.sumDigit();
        Assertions.assertThat(harshadNumber.getSumDigitResult()).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"10:true", "12:true", "11:false", "13:false"}, delimiter = ':')
    void isHarshadNumber(int number, boolean expected) {
        HarshadNumber harshadNumber = new HarshadNumber(number);
        Assertions.assertThat(harshadNumber.isHashadNumber()).isEqualTo(expected);
    }
}

