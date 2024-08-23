package study.algorithm.baekjoon.silver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

@DisplayName("거스름돈 테스트")
public class CashChangeTest {
    private CashChange cashChange;

    @BeforeEach
    void setUp() {
        cashChange = new CashChange();
    }

    @Test
    void case1() {
        int input = 14;
        int answer = 4;

        Assertions.assertThat(cashChange.changeByFiveAndTwo(input)).isEqualTo(answer);
    }

    @Test
    void case2() {
        int input = 15;
        int answer = 3;

        Assertions.assertThat(cashChange.changeByFiveAndTwo(input)).isEqualTo(answer);
    }

    @Test
    void case3() {
        int input = 13;
        int answer = 5;

        Assertions.assertThat(cashChange.changeByFiveAndTwo(input)).isEqualTo(answer);
    }
}

class CashChange {
    private final int fiveWon = 5;
    private final int twoWon = 2;
    private int result = -1;

    public int changeByFiveAndTwo(int cash) {
        int startFiveWonCount = cash / fiveWon;
        int reminderByFiveWon = cash / fiveWon;

        if (0 < startFiveWonCount && reminderByFiveWon == 0) {
            return startFiveWonCount;
        }

        for (int fiveWonCount = startFiveWonCount; 0 <= fiveWonCount; fiveWonCount--) {
            int reminder = cash - (fiveWon * fiveWonCount);

            if (reminder % twoWon == 0) {
                result = fiveWonCount + (reminder / twoWon);
                break;
            }
        }

        return result;
    }
}
