package study.algorithm.baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

@DisplayName("좌표 정렬하기 테스트")
public class SortingCoordinatesTest {

    @Test
    void case1() {
        int[][] coordinates = {
                {3, 4},
                {1, 1},
                {1, -1},
                {2, 2},
                {3, 3}
        };

        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }

                return o1[0] - o2[1];
            }
        });

        for (int count = 0; count < 5; count++) {
            System.out.println(coordinates[count][0] + " " + coordinates[count][1]);
        }
    }
}