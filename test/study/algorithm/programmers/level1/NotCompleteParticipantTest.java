package study.algorithm.programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("완주하지 못한 선수")
public class NotCompleteParticipantTest {
    private NotCompleteParticipant notCompleteParticipant;

    @BeforeEach
    void setUp() {
        notCompleteParticipant = new NotCompleteParticipant();
    }

    @Test
    void case1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = "leo";

        Assertions.assertThat(notCompleteParticipant.find(participant, completion)).isEqualTo(result);
    }

    @Test
    void case2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String result = "vinko";

        Assertions.assertThat(notCompleteParticipant.find(participant, completion)).isEqualTo(result);
    }

    @Test
    void case3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String result = "mislav";

        Assertions.assertThat(notCompleteParticipant.find(participant, completion)).isEqualTo(result);
    }

    @Test
    void case4() {
        String[] participant = {"mislav", "stanko", "mislav", "ana", "mislav"};
        String[] completion = {"stanko", "ana", "mislav", ""};
        String result = "mislav";

        Assertions.assertThat(notCompleteParticipant.find(participant, completion)).isEqualTo(result);
    }
}
