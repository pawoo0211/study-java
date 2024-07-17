package study.algorithm.baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class BlackJack {

    public String findMaxValue(String input1, String input2) {
        String[] splitInput1 = input1.split(" ");
        Integer totalCardNumber = Integer.valueOf(splitInput1[0]);
        Integer maxNumber = Integer.valueOf(splitInput1[1]);
        List<Integer> cards = Arrays.stream(input2.split(" "))
                .map(thisCard -> Integer.valueOf(thisCard))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int sum = 0;

        for (int index = 0; index < totalCardNumber - 2; index++) {
            for (int innerIndex1 = index + 1; innerIndex1 < totalCardNumber - 1; innerIndex1++) {
                for (int innerIndex2 = innerIndex1 + 1; innerIndex2 < totalCardNumber; innerIndex2++) {
                    int currentSum = cards.get(index) + cards.get(innerIndex1) + cards.get(innerIndex2);
                    if (currentSum <= maxNumber && sum <= currentSum) {
                        sum = currentSum;
                    }
                }
            }
        }

        return String.valueOf(sum);
    }
}