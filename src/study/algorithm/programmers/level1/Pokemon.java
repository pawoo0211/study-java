package study.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Pokemon {

    public int findMaxCase(int[] numbers) {
        int answer;

        Set<Integer> numsSet = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toSet());

        return Math.min(numsSet.size(), numbers.length / 2);
    }
}
