package study.algorithm.baekjoon.silver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BABBA 테스트")
public class BABBATest {
    private BABBB babbb = new BABBB();

    @BeforeEach
    void setUp() {
        babbb = new BABBB();
    }

    @Test
    void case1() {
        int input = 1;
        String answer = "0 1";

        Assertions.assertThat(babbb.findABCount(input)).isEqualTo(answer);
    }

    @Test
    void case2() {
        int input = 4;
        String answer = "2 3";

        Assertions.assertThat(babbb.findABCount(input)).isEqualTo(answer);
    }

    @Test
    void case3() {
        int input = 10;
        String answer = "34 55";

        Assertions.assertThat(babbb.findABCount(input)).isEqualTo(answer);
    }

    class BABBB {
        private int[][] abCount = {
                {1},
                {0}
        };

        public String findABCount(int repeatCount) {
            for (int count = 0; count < repeatCount; count++) {
                count(abCount);
            }

            return abCount[0][0] + " " + abCount[1][0];
        }

        private int[][] count(int[][] abCount) {
            int temporalCountA = abCount[1][0];
            int temporalCountB = abCount[0][0] + temporalCountA;

            abCount[0][0] = temporalCountA;
            abCount[1][0] = temporalCountB;

            return abCount;
        }
    }
}
