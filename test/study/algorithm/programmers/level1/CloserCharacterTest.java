package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("가장 가까운 글자 테스트")
public class CloserCharacterTest {

    /**
     * 앞에 같은 글자가 없는 경우 -> -1
     * 앞에 같은 글자가 있는 경우 -> 자신의 위치 기준으로 뒤에서부터 +1
     */
    @Test
    void 가장_가까운_글자_탐색1() {
        String input = "banana";
        int[] result = {-1, -1, -1, 2, 2, 2};

        CloserChar closerChar = new CloserChar(input);

        Assertions.assertThat(closerChar.find(input)).containsExactly(result);
    }

    @Test
    void 가장_가까운_글자_탐색2() {
        String input = "foobar";
        int[] result = {-1, -1, 1, -1, -1, -1};

        CloserChar closerChar = new CloserChar(input);

        Assertions.assertThat(closerChar.find(input)).containsExactly(result);
    }
}
