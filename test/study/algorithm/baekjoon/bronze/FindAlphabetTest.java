package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

@DisplayName("알파벳 찾기 테스트")
public class FindAlphabetTest {
    private FindAlphabet findAlphabet;

    @BeforeEach
    void setUp() {
        findAlphabet = new FindAlphabet();
    }

    @Test
    void case1() {
        String input = "baekjoon";
        String answer = "1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1";

        String result = findAlphabet.find(input);

        Assertions.assertThat(result).isEqualTo(answer);
    }
}

class FindAlphabet {

    public String find(String word) {
        Map<String, Integer> alphabetMap = new HashMap<>();

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            alphabetMap.put(String.valueOf(alphabet), -1);
        }

        String[] splitInput = word.split("");
        for (int index = 0; index < splitInput.length; index++) {
            String alphabet = splitInput[index];
            if (alphabetMap.get(alphabet).equals(-1)) {
                alphabetMap.put(alphabet, index);
            }
        }

        String result = "";
        for (Integer alphabetIndex : alphabetMap.values()) {
            result = result + String.valueOf(alphabetIndex) + " ";
        }

        return result.substring(0, result.length() -1);
    }
}