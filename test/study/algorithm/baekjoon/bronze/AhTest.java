package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("아!")
public class AhTest {

    @Test
    void case1() {
        String 재환_ah = "aaah";
        String 닥터_ah = "aaaaah";
        String answer = "no";

        Ah ah = new Ah(재환_ah, 닥터_ah);
        Assertions.assertThat(ah.checkCanIGo()).isEqualTo(answer);
    }

    @Test
    void case2() {
        String 재환_ah = "aaah";
        String 닥터_ah = "ah";
        String answer = "go";

        Ah ah = new Ah(재환_ah, 닥터_ah);
        Assertions.assertThat(ah.checkCanIGo()).isEqualTo(answer);
    }
}

class Ah {
    private String canSound;
    private String doctorWantSound;

    public Ah(String canSound, String doctorWantSound) {
        this.canSound = canSound;
        this.doctorWantSound = doctorWantSound;
    }

    public String checkCanIGo() {
        int myAhIndex = canSound.indexOf('h');
        int doctorAhIndex = doctorWantSound.indexOf('h');

        if (doctorAhIndex <= myAhIndex) {
            return "go";
        }

        return "no";
    }
}
