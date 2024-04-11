package study.algorithm.programmers.level1;

public class CharacterChecker {
    private int countCharacterP = 0;
    private int countCharacterY = 0;

    public void countCharacterPendY(String input) {
        for (int index = 0; index < input.length(); index++) {
            char character = input.charAt(index);
            if (isCharacterP(character)) {
                countCharacterP = countCharacterP + 1;
            }
            if (isCharacterY(character)) {
                countCharacterY = countCharacterY + 1;
            }
        }
    }

    private boolean isCharacterP(char character) {
        return character == 'P' || character == 'p';
    }

    private boolean isCharacterY(char character) {
        return character == 'Y' || character == 'y';
    }

    public boolean isEqualCount() {
        return countCharacterP == countCharacterY;
    }
}
