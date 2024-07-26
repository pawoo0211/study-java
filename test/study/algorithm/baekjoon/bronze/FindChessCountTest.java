package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("킹, 퀸, 룩, 비숍, 나이트, 폰")
public class FindChessCountTest {
    private FindChessCount findChessCount;

    @BeforeEach
    void setUp() {
        findChessCount = new FindChessCount();
    }

    @Test
    void case1() {
        String input = "0 1 2 2 2 7";
        String answer = "1 0 0 0 0 1";
        Assertions.assertThat(findChessCount.getLoseCount(input)).isEqualTo(answer);
    }

    @Test
    void case2() {
        String input = "2 1 2 1 2 1";
        String answer = "-1 0 0 1 0 7";
        Assertions.assertThat(findChessCount.getLoseCount(input)).isEqualTo(answer);
    }

    class FindChessCount {
        private int[] chessPieces = {1, 1, 2, 2, 2, 8};

        public String getLoseCount(String input) {
            String losePieces = "";
            String[] inputPieces = input.split(" ");

            for (int index = 0; index < chessPieces.length; index++) {
                int losePieceCount = Integer.valueOf(chessPieces[index]) - Integer.valueOf(inputPieces[index]);
                losePieces = losePieces + losePieceCount + " ";
            }

            return losePieces.substring(0, losePieces.length() - 1);
        }
    }
}
