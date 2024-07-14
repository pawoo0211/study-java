package study.algorithm.programmers.level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("옳바른 괄호 테스트")
public class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    void case1() {
        String s = "()()";
        boolean answer = true;
        Assertions.assertThat(validParentheses.isValid(s)).isEqualTo(answer);
    }

    @Test
    void case2() {
        String s = "(())()";
        boolean answer = true;
        Assertions.assertThat(validParentheses.isValid(s)).isEqualTo(answer);
    }

    @Test
    void case3() {
        String s = ")())";
        boolean answer = false;
        Assertions.assertThat(validParentheses.isValid(s)).isEqualTo(answer);
    }

    @Test
    void case4() {
        String s = "((()";
        boolean answer = false;
        Assertions.assertThat(validParentheses.isValid(s)).isEqualTo(answer);
    }

    @Test
    void splitTimeComplexityTest() {
        String input = "1111111111111111111111111111111111111111111111111111";

        long startTime1 = System.nanoTime();
        input.split("");
        long endTime1 = System.nanoTime();
        System.out.println("slice method time : " + String.valueOf(endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        input.toCharArray();
        long endTime2 = System.nanoTime();
        System.out.println("toCharArray method time : " + String.valueOf(endTime2 - startTime2));
    }
}