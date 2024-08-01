package study.algorithm.baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

@DisplayName("숫자 카드")
public class NumberCardTest {

    @Test
    void case1() {
        List<Integer> myCards = new ArrayList<>(List.of(6, 3, 2, 10, -10));
        List<Integer> standardCards = new ArrayList<>(List.of(10, 9, -5, 2, 3, 4, 5, -10));

        // standardCards 순서 유지를 위해 Map 저장
        Map<Integer, Integer> standardCardCount = new LinkedHashMap<>();
        for (Integer standardCardNumber : standardCards) {
            standardCardCount.put(standardCardNumber, 0);
        }

        // 두 카드를 오름차순으로 정렬
        Collections.sort(myCards);
        Collections.sort(standardCards);

        // 이분 탐색을 통해 내 카드가 있는지 없는지 확인
        for (Integer standardCardNumber : standardCards) {
            standardCardCount.put(standardCardNumber, hasNumber(standardCardNumber, myCards));
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer standardCardNumber : standardCardCount.keySet()) {
            System.out.println(standardCardNumber);
            stringBuilder.append(standardCardCount.get(standardCardNumber) + " ");
        }

        System.out.println(stringBuilder.toString().trim());
    }

    private int hasNumber(Integer standardCardNumber, List<Integer> myCards) {
        int leftIndex = 0;
        int rightIndex = myCards.size() - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (rightIndex + leftIndex) / 2;
            Integer midValue = myCards.get(midIndex);

            if (midValue.equals(standardCardNumber)) {
                return 1;
            } else if (midValue < standardCardNumber) {
                leftIndex = midIndex + 1;
            } else if (standardCardNumber < midValue) {
                rightIndex = midIndex - 1;
            }
        }

        return 0;
    }
}