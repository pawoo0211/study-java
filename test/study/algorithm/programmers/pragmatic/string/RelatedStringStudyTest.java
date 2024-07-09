package study.algorithm.programmers.pragmatic.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 관련 테스트")
public class RelatedStringStudyTest {

    @Test
    @DisplayName("String 불변성 테스트")
    void stringImmutability() {
        String original = "hello";
        String modified = original + " world";

        System.out.println("original.hashCode() : " + original.hashCode());
        System.out.println("modified.hashCode() : " + modified.hashCode());
    }

    @Test
    @DisplayName("StringBuffer 가변성 테스트")
    void stringBufferMutability() {
        String original = "hello";
        StringBuffer stringBuffer = new StringBuffer(original);

        System.out.println("stringBuffer.hashCode : " + original.hashCode());
        stringBuffer.append(" world");
        System.out.println("stringBuffer.hashCode : " + original.hashCode());
    }

    @Test
    @DisplayName("StringBuilder Non Thread-safe 테스트")
    void stringBuilderNonThreadSafety() throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder("start");
        int threadCount = 10;
        int appendCount = 1000;
        int expectedLength = "start".length() + threadCount * appendCount;

        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < appendCount; j++) {
                    stringBuilder.append("a");
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("expectedLength : " + expectedLength);
        System.out.println("stringBuilder.length() : " + stringBuilder.length());
        Assertions.assertNotEquals(expectedLength, stringBuilder.length(), "StringBuilder is not thread-safe.");
    }
}
