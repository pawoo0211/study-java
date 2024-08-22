package study.algorithm.baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

@DisplayName("좌표 정렬하기2 테스트")
public class SortingCoordinates2Test {

    @Test
    void case1() {
        int xy[][] = {
                {0, 4},
                {1, 2},
                {1, -1},
                {2, 2},
                {3, 3}
        };

        Arrays.sort(xy, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (int count = 0; count < 5; count++) {
            stringBuilder.append(xy[count][0] + " " + xy[count][1] + "\n");
        }

        System.out.println(stringBuilder);
    }
}