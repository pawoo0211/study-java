package study.algorithm.baekjoon.silver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

@DisplayName("문서 검색 테스트")
public class SearchDocumentTest {
    private SearchDocument searchDocument;

    @BeforeEach
    void setUp() {
        searchDocument = new SearchDocument();
    }

    @Test
    void case1() {
        List<String> input = new ArrayList<>(List.of("a", "b", "a", "b", "a", "b", "a", "b", "a"));
        String searchWord = "aba";
        int answer = 2;

        Assertions.assertThat(searchDocument.search(input, searchWord)).isEqualTo(answer);
    }

    @Test
    void case2() {
        List<String> input = new ArrayList<>(List.of("a", " ", "a", " ", "a", " ", "a", " ", "a"));
        String searchWord = "a a";
        int answer = 2;

        Assertions.assertThat(searchDocument.search(input, searchWord)).isEqualTo(answer);
    }

    @Test
    void case3() {
        List<String> input = new ArrayList<>(List.of("a", "b", "a", "b", "a", "b", "a", "b", "a"));
        String searchWord = "ababa";
        int answer = 1;

        Assertions.assertThat(searchDocument.search(input, searchWord)).isEqualTo(answer);
    }

    @Test
    void case4() {
        // aa aa aa a
        List<String> input = new ArrayList<>(List.of("a", "a", "a", "a", "a", "a", "a"));
        String searchWord = "aa";
        int answer = 3;

        Assertions.assertThat(searchDocument.search(input, searchWord)).isEqualTo(answer);
    }

    class SearchDocument {

        public int search(List<String> document, String word) {
            int addSearchWordLength = word.length();
            int index = 0;

            int count = 0;
            while (index < document.size()) {
                // 현재 인덱스 + searchWord의 길이 값이 input의 길이보다 클 경우 반복문에서 제외
                int lastIndex = index + addSearchWordLength;
                if (document.size() < lastIndex) {
                    break;
                }

                // 현재 인덱스에서 searchWord의 길이 만큼만 검색
                String wordInDocument = document.subList(index, lastIndex)
                        .stream()
                        .collect(Collectors.joining());

                // 찾을 경우 현재 인덱스를 마지막 인덱스 + 1로 초기화
                if (word.equals(wordInDocument)) {
                    count = count + 1;
                    index = index + addSearchWordLength;
                    continue;
                }

                // searchWord가 없는 경우 현재 인덱스++
                index++;
            }

            return count;
        }
    }
}