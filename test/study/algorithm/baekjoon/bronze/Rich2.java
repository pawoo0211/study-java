package study.algorithm.baekjoon.bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

@DisplayName("엄청난 부자2")
public class Rich2 {
    private RichTwo richTwo;

    @Test
    void case1() {
        String money = "1000";
        String countOfRecipient = "100";
        richTwo = new RichTwo(money, countOfRecipient);

        Assertions.assertThat(richTwo.receiveMoney()).isEqualTo("10");
        Assertions.assertThat(richTwo.reminder()).isEqualTo("0");
    }

    @Test
    void case2() {
        // 생명체가 0인 경우
        String money = "1000";
        String countOfRecipient = "0";
        richTwo = new RichTwo(money, countOfRecipient);

        System.out.println(richTwo.receiveMoney());
        System.out.println(richTwo.reminder());

    }

    class RichTwo {
        private BigInteger bigDecimalMoney;
        private BigInteger bigDecimalCountOfRecipient;

        public RichTwo(String money, String countOfRecipient) {
            bigDecimalMoney = new BigInteger(money);
            bigDecimalCountOfRecipient = new BigInteger(countOfRecipient);
        }

        public String receiveMoney() {
            if (bigDecimalCountOfRecipient.compareTo(BigInteger.ZERO) == 0) {
                return String.valueOf(bigDecimalMoney);
            }
            return String.valueOf(bigDecimalMoney.divide(bigDecimalCountOfRecipient));
        }


        public String reminder() {
            if (bigDecimalCountOfRecipient.compareTo(BigInteger.ZERO) == 0) {
                return String.valueOf(BigInteger.ZERO);
            }
            return String.valueOf(bigDecimalMoney.remainder(bigDecimalCountOfRecipient));
        }
    }
}
