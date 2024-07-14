package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("같은 숫자는 싫어 테스트")
public class HateSameNumberTest {
    private HateSameNumber hateSameNumber;

    @BeforeEach
    void setUp() {
        hateSameNumber = new HateSameNumber();
    }

    @Test
    void case1() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {1, 3, 0, 1};

        Assertions.assertThat(hateSameNumber.removeDuplicatesOnRight(arr))
                .containsExactly(answer);
    }

    @Test
    void case2() {
        int[] arr = {4, 4, 4, 3, 3};
        int[] answer = {4, 3};

        Assertions.assertThat(hateSameNumber.removeDuplicatesOnRight(arr))
                .containsExactly(answer);
    }
}