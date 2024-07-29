package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("OX 퀴즈 테스트")
public class OXQuizeTest {
    private OXQuize oxQuize;

    @BeforeEach
    void setUp() {
        oxQuize = new OXQuize();
    }

    @Test
    void case1() {
        String input = "OXOXOXOXOXOXOX";
        String answer = "7";

        Assertions.assertThat(oxQuize.score(input)).isEqualTo(answer);
    }

    @Test
    void case2() {
        String input = "OOOOOOOOOO";
        String answer = "55";

        Assertions.assertThat(oxQuize.score(input)).isEqualTo(answer);
    }

}

class OXQuize {

    public String score(String input) {
        char[] inputToChar = input.toCharArray();
        int count = 0;
        int addValue = 0;
        for (char quizeResult : inputToChar) {
            if (quizeResult == 'O') {
                addValue++;
                count = count + addValue;
            } else {
                addValue = 0;
            }
        }

        return String.valueOf(count);
    }
}