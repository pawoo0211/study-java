package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 내 p와 y의 개수")
public class CharacterCheckerTest {
    private final CharacterChecker characterChecker = new CharacterChecker();

    @Test
    void countCharacter() {
        String givenData = "pPoooyY";
        characterChecker.countCharacterPendY(givenData);
        Assertions.assertThat(characterChecker.isEqualCount()).isTrue();
    }

    @Test
    void countCharacterIsNotEqual() {
        String givenData = "Pyy";
        characterChecker.countCharacterPendY(givenData);
        Assertions.assertThat(characterChecker.isEqualCount()).isFalse();
    }
}