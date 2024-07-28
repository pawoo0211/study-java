package study.algorithm.baekjoon.dynamicprogramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("계단 오르기 테스트")
public class StairClimberTest {
    private StairClimber stairClimber;

    @BeforeEach
    void setUp() {
        stairClimber = new StairClimber();
    }

    @Test
    void case1() {
        String input = "10 20 15 25 10 20";
        String answer = "75";

        Assertions.assertThat(stairClimber.maxValue(input)).isEqualTo(answer);
    }

    @Test
    void case2() {
        String input = "6 10 20 15 25 10 20";
        String answer = "75";

        Assertions.assertThat(stairClimber.maxValue(input)).isEqualTo(answer);
    }
}

class StairClimber {

    public String maxValue(String input) {
        int[] stairValues = Arrays.stream(input.split(" "))
                .mapToInt(thisValue -> Integer.parseInt(thisValue))
                .toArray();
        int maxValue = stairValues[stairValues.length - 1];

        int countThree = 0;
        for (int stairsIndex = stairValues.length - 2; 0 < stairsIndex; stairsIndex--) {
            int firstDescendStairValue = stairValues[stairsIndex];
            int secondDescendStairValue = stairValues[stairsIndex -1];

            if (secondDescendStairValue <= firstDescendStairValue) {
                if (countThree == 3) {
                    maxValue = maxValue + secondDescendStairValue;
                    stairsIndex = stairsIndex - 1;

                    if (stairsIndex == 1) {
                        maxValue = maxValue + stairValues[0];
                    }

                    countThree = 0;
                }

                maxValue = maxValue + firstDescendStairValue;
                countThree++;
            } else {
                maxValue = maxValue + secondDescendStairValue;
                stairsIndex = stairsIndex - 1;

                if (stairsIndex == 1) {
                    maxValue = maxValue + stairValues[0];
                }
            }
        }

        return String.valueOf(maxValue);
    }
}