package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashMap;
import java.util.Map;

@DisplayName("메인 테스트")
public class MainTest {

    @Test
    void 임시_테스트() throws Exception {
        String input = "baekjoon";
        String answer = "1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1";
        Map<String, Integer> alphabetMap = new HashMap<>();

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            alphabetMap.put(String.valueOf(alphabet), -1);
        }

        String[] splitInput = input.split("");
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
        result = result.substring(0, result.length() -1);

        System.out.println("result : " + result);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}