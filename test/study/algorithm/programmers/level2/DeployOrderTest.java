package study.algorithm.programmers.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("기능 개발 테스트")
public class DeployOrderTest {
    private DeployOrder deployOrder;

    @BeforeEach
    void setUp() {
        deployOrder = new DeployOrder();
    }

    @Test
    void case1() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = {2, 1};

        Assertions.assertThat(deployOrder.execute(progresses, speeds))
                .containsExactly(answer);
    }

    @Test
    void case2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = {1, 3, 2};

        Assertions.assertThat(deployOrder.execute(progresses, speeds))
                .containsExactly(answer);
    }
}