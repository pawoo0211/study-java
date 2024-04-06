package study.algorithm.programmers.level1;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 정수로 바꾸기")
public class StringToNumberConverterTest {
    private StringToNumberConverter converter = new StringToNumberConverter();

    @Test
    void convert() {
        String givenNuber = "1234";
        Assertions.assertThat(converter.convert(givenNuber)).isEqualTo(1234);
    }

    @Test
    void convertNegative() {
        String givenNumber = "-1234";
        Assertions.assertThat(converter.convert(givenNumber))
                .isEqualTo(-1234);
    }
}