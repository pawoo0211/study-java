package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

@DisplayName("푸드 파이트 대회 테스트")
public class FoodFightTest {
    private FoodFight foodFight;

    @BeforeEach
    void setUp() {
        foodFight = new FoodFight();
    }

    @Test
    void example1() {
        int[] food = {1, 3, 4, 6};
        String result = "1223330333221";

        Assertions.assertThat(foodFight.sort(food)).isEqualTo(result);
    }

    @Test
    void example2() {
        int[] food = {1, 7, 1, 2};
        String result = "111303111";

        Assertions.assertThat(foodFight.sort(food)).isEqualTo(result);
    }

    @Test
    void string_object() {
        String test1 = "1234";
        System.out.println("test1 : " + Objects.hashCode(test1));
        System.out.println("test1 : " + Objects.hashCode(test1 + "5"));
    }
}
