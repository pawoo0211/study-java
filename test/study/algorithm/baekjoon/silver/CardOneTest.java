package study.algorithm.baekjoon.silver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("카드1 테스트")
public class CardOneTest {
    private CardOne cardOne;

    @BeforeEach
    void setUp() {
        cardOne = new CardOne();
    }

    @Test
    void case1() {
        int input = 7;
        String result = "1 3 5 7 4 2 6";

        Assertions.assertThat(cardOne.discard(input)).isEqualTo(result);
    }

    @Test
    void case2() {
        int input = 4;
        String result = "1 3 2 4";

        Assertions.assertThat(cardOne.discard(input)).isEqualTo(result);
    }
}

class CardOne {
    private String answer = "";

    public String discard(int input) {
        Queue<Integer> queue = new LinkedList<>();
        for (int cardNumber = 1; cardNumber <= input; cardNumber++) {
            queue.add(cardNumber);
        }

        boolean isDoDiscard = true;
        while (1 < queue.size()) {
            if (isDoDiscard) {
                isDoDiscard = false;
                answer = answer + String.valueOf(queue.poll()) + " ";
            } else {
                isDoDiscard = true;
                Integer removedNumber = queue.poll();
                queue.add(removedNumber);
            }
        }

        return answer + queue.peek();
    }
}
