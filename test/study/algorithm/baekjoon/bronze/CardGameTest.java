package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("카드 게임 테스트")
public class CardGameTest {
    private CardGame cardGame;

    @BeforeEach
    void setUp() {
        cardGame = new CardGame();
    }

    @Test
    void case1() {
        List<String> inputs = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        String answer = "15";

        Assertions.assertThat(cardGame.sum(inputs)).isEqualTo(answer);
    }

    @Test
    void case2() {
        List<String> inputs = new ArrayList<>(Arrays.asList("0", "100", "0", "10", "100"));
        String answer = "210";

        Assertions.assertThat(cardGame.sum(inputs)).isEqualTo(answer);
    }

    class CardGame {

        public String sum(List<String> inputs) {
            BigInteger sum = inputs
                    .stream()
                    .map(thisInput -> new BigInteger(thisInput))
                    .reduce(BigInteger.ZERO, BigInteger::add);

            return String.valueOf(sum);
        }
    }
}
