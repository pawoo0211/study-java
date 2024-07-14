package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("포켓몬 테스트")
public class PokemonTest {
    private Pokemon pokemon;

    @BeforeEach
    void setUp() {
        pokemon = new Pokemon();
    }

    @Test
    void case1() {
        int[] nums = {3, 1, 2, 3};
        int result = 2;

        Assertions.assertThat(pokemon.findMaxCase(nums)).isEqualTo(result);
    }

    @Test
    void case2() {
        int[] nums = {3, 3, 3, 2, 2, 4};
        int result = 3;

        Assertions.assertThat(pokemon.findMaxCase(nums)).isEqualTo(result);
    }

    @Test
    void case3() {
        int[] nums = {3, 3, 3, 2, 2, 2};
        int result = 2;

        Assertions.assertThat(pokemon.findMaxCase(nums)).isEqualTo(result);
    }
}
