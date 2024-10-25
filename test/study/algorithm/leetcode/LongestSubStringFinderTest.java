package study.algorithm.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

@DisplayName("중복을 제외한 가장 긴 SubString 찾기 테스트")
public class LongestSubStringFinderTest {
    private LongestSubStringFinder finder;

    @BeforeEach
    void setUp() {
        finder = new LongestSubStringFinder();
    }

    @Test
    void case1() {
        String input = "abcabcbb";
        int answer = 3;

        Assertions.assertThat(finder.lengthOfLongestSubstring(input)).isEqualTo(answer);
    }
}

class LongestSubStringFinder {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        Set<Character> uniqueCharacterSet = new HashSet<>();
        while (right < s.length()) {
            if (!uniqueCharacterSet.contains(s.charAt(right))) {
                uniqueCharacterSet.add(s.charAt(right++));
                max = Math.max(max, uniqueCharacterSet.size());
            } else {
                uniqueCharacterSet.remove(s.charAt(left++));
            }
        }

        return max;
    }
}
