package study.algorithm.baekjoon;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("블랙잭 테스트")
public class BlackJackTest {
    private BlackJack blackJack;

    @BeforeEach
    void setUp() {
        blackJack = new BlackJack();
    }

    @Test
    void case1() {
        String input1 = "5 21";
        String input2 = "5 6 7 8 9";
        String answer = "21";

        String result = blackJack.findMaxValue(input1, input2);

        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void case2() {
        String input1 = "10 500";
        String input2 = "93 181 245 214 315 36 185 138 216 295";
        String answer = "497";

        String result = blackJack.findMaxValue(input1, input2);

        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void case3() {
        String input1 = "5 21";
        String input2 = "1 9 10 30 40";
        String answer = "20";

        String result = blackJack.findMaxValue(input1, input2);

        Assertions.assertThat(result).isEqualTo(answer);
    }
}